// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: IStreamRequest.cs.tt

namespace Microsoft.Graph2.CallRecords
{
    using System.Collections.Generic;
    using System.IO;
    using System.Net.Http;
    using System.Threading;

    /// <summary>
    /// The interface IPhotoContentRequest.
    /// </summary>
    public partial interface IPhotoContentRequest : Microsoft.Graph.IBaseRequest
    {
        /// <summary>
        /// Gets the stream.
        /// </summary>
        /// <returns>The stream.</returns>
        System.Threading.Tasks.Task<Stream> GetAsync();

        /// <summary>
        /// Gets the stream.
        /// </summary>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <param name="completionOption">The <see cref="HttpCompletionOption"/> to pass to the <see cref="Microsoft.Graph.IHttpProvider"/> on send.</param>
        /// <returns>The stream.</returns>
        System.Threading.Tasks.Task<Stream> GetAsync(CancellationToken cancellationToken, HttpCompletionOption completionOption = HttpCompletionOption.ResponseContentRead);


        /// <summary>
        /// PUTs the specified stream.
        /// </summary>
        /// <param name="content">The stream to PUT.</param>
        /// <returns>The updated stream.</returns>
        System.Threading.Tasks.Task<Stream> PutAsync(Stream content);

        /// <summary>
        /// PUTs the specified stream.
        /// </summary>
        /// <param name="content">The stream to PUT.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <param name="completionOption">The <see cref="HttpCompletionOption"/> to pass to the <see cref="Microsoft.Graph.IHttpProvider"/> on send.</param>
        /// <returns>The updated stream.</returns>
        System.Threading.Tasks.Task<Stream> PutAsync(Stream content, CancellationToken cancellationToken, HttpCompletionOption completionOption = HttpCompletionOption.ResponseContentRead);
    
    }
}