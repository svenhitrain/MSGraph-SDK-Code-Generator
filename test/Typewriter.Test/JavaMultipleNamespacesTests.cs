﻿using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Typewriter.Test
{
    [TestClass]
    public class JavaMultipleNamespacesTests
    {
        [TestMethod]
        public void Test()
        {
            MultipleNamespacesTestRunner.Run(TestLanguage.Java);
        }
    }
}
