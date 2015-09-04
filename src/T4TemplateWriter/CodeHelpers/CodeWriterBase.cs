﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Vipr.Core.CodeModel;
using Vipr.T4TemplateWriter.Extensions;

namespace Vipr.T4TemplateWriter.CodeHelpers
{
    using Vipr.T4TemplateWriter.Settings;

    abstract public class CodeWriterBase
    {
        public OdcmModel CurrentModel { get; set; }

        public CodeWriterBase() : this(null) { }

        public CodeWriterBase(OdcmModel model)
        {
            this.CurrentModel = model;
        }
        public virtual String NewLineCharacter
        {
            get { return Environment.NewLine; }
        }

        public static String Write(params String[] args)
        {
            StringBuilder sb = new StringBuilder();
            foreach (String arg in args)
            {
                sb.Append(arg);
            }
            return sb.ToString();
        }

        abstract public String WriteOpeningCommentLine();

        abstract public String WriteClosingCommentLine();

        abstract public String WriteInlineCommentChar();

        public String WriteHeader(IEnumerable<string> additionalHeader = null)
        {
            return Write(new String[] {
                WriteOpeningCommentLine(),
                string.Join(this.NewLineCharacter,
                    ConfigurationService.Settings.LicenseHeader
                        .Select(line => WriteInlineCommentChar() + line)
                        .ToArray()),
                additionalHeader != null
                    ? string.Join(this.NewLineCharacter,
                        additionalHeader
                            .Select(line => WriteInlineCommentChar() + line)
                            .ToArray()) + this.NewLineCharacter
                    : "",
                WriteClosingCommentLine()
              });

        }
    }
}
