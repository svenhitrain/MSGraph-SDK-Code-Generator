// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: EntityRequest.cs.tt

namespace Microsoft.Graph
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Net.Http;
    using System.Threading;
    using System.Linq.Expressions;

    /// <summary>
    /// The type CloudCommunicationsRequest.
    /// </summary>
    public partial class CloudCommunicationsRequest : BaseRequest, ICloudCommunicationsRequest
    {
        /// <summary>
        /// Constructs a new CloudCommunicationsRequest.
        /// </summary>
        /// <param name="requestUrl">The URL for the built request.</param>
        /// <param name="client">The <see cref="IBaseClient"/> for handling requests.</param>
        /// <param name="options">Query and header option name value pairs for the request.</param>
        public CloudCommunicationsRequest(
            string requestUrl,
            IBaseClient client,
            IEnumerable<Option> options)
            : base(requestUrl, client, options)
        {
        }

        /// <summary>
        /// Creates the specified CloudCommunications using POST.
        /// </summary>
        /// <param name="cloudCommunicationsToCreate">The CloudCommunications to create.</param>
        /// <returns>The created CloudCommunications.</returns>
        public System.Threading.Tasks.Task<CloudCommunications> CreateAsync(CloudCommunications cloudCommunicationsToCreate)
        {
            return this.CreateAsync(cloudCommunicationsToCreate, CancellationToken.None);
        }

        /// <summary>
        /// Creates the specified CloudCommunications using POST.
        /// </summary>
        /// <param name="cloudCommunicationsToCreate">The CloudCommunications to create.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The created CloudCommunications.</returns>
        public async System.Threading.Tasks.Task<CloudCommunications> CreateAsync(CloudCommunications cloudCommunicationsToCreate, CancellationToken cancellationToken)
        {
            this.ContentType = "application/json";
            this.Method = "POST";
            var newEntity = await this.SendAsync<CloudCommunications>(cloudCommunicationsToCreate, cancellationToken).ConfigureAwait(false);
            this.InitializeCollectionProperties(newEntity);
            return newEntity;
        }

        /// <summary>
        /// Deletes the specified CloudCommunications.
        /// </summary>
        /// <returns>The task to await.</returns>
        public System.Threading.Tasks.Task DeleteAsync()
        {
            return this.DeleteAsync(CancellationToken.None);
        }

        /// <summary>
        /// Deletes the specified CloudCommunications.
        /// </summary>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The task to await.</returns>
        public async System.Threading.Tasks.Task DeleteAsync(CancellationToken cancellationToken)
        {
            this.Method = "DELETE";
            await this.SendAsync<CloudCommunications>(null, cancellationToken).ConfigureAwait(false);
        }

        /// <summary>
        /// Gets the specified CloudCommunications.
        /// </summary>
        /// <returns>The CloudCommunications.</returns>
        public System.Threading.Tasks.Task<CloudCommunications> GetAsync()
        {
            return this.GetAsync(CancellationToken.None);
        }

        /// <summary>
        /// Gets the specified CloudCommunications.
        /// </summary>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The CloudCommunications.</returns>
        public async System.Threading.Tasks.Task<CloudCommunications> GetAsync(CancellationToken cancellationToken)
        {
            this.Method = "GET";
            var retrievedEntity = await this.SendAsync<CloudCommunications>(null, cancellationToken).ConfigureAwait(false);
            this.InitializeCollectionProperties(retrievedEntity);
            return retrievedEntity;
        }

        /// <summary>
        /// Updates the specified CloudCommunications using PATCH.
        /// </summary>
        /// <param name="cloudCommunicationsToUpdate">The CloudCommunications to update.</param>
        /// <returns>The updated CloudCommunications.</returns>
        public System.Threading.Tasks.Task<CloudCommunications> UpdateAsync(CloudCommunications cloudCommunicationsToUpdate)
        {
            return this.UpdateAsync(cloudCommunicationsToUpdate, CancellationToken.None);
        }

        /// <summary>
        /// Updates the specified CloudCommunications using PATCH.
        /// </summary>
        /// <param name="cloudCommunicationsToUpdate">The CloudCommunications to update.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <exception cref="ClientException">Thrown when an object returned in a response is used for updating an object in Microsoft Graph.</exception>
        /// <returns>The updated CloudCommunications.</returns>
        public async System.Threading.Tasks.Task<CloudCommunications> UpdateAsync(CloudCommunications cloudCommunicationsToUpdate, CancellationToken cancellationToken)
        {
			if (cloudCommunicationsToUpdate.AdditionalData != null)
			{
				if (cloudCommunicationsToUpdate.AdditionalData.ContainsKey(Constants.HttpPropertyNames.ResponseHeaders) ||
					cloudCommunicationsToUpdate.AdditionalData.ContainsKey(Constants.HttpPropertyNames.StatusCode))
				{
					throw new ClientException(
						new Error
						{
							Code = GeneratedErrorConstants.Codes.NotAllowed,
							Message = String.Format(GeneratedErrorConstants.Messages.ResponseObjectUsedForUpdate, cloudCommunicationsToUpdate.GetType().Name)
						});
				}
			}
            if (cloudCommunicationsToUpdate.AdditionalData != null)
            {
                if (cloudCommunicationsToUpdate.AdditionalData.ContainsKey(Constants.HttpPropertyNames.ResponseHeaders) ||
                    cloudCommunicationsToUpdate.AdditionalData.ContainsKey(Constants.HttpPropertyNames.StatusCode))
                {
                    throw new ClientException(
                        new Error
                        {
                            Code = GeneratedErrorConstants.Codes.NotAllowed,
                            Message = String.Format(GeneratedErrorConstants.Messages.ResponseObjectUsedForUpdate, cloudCommunicationsToUpdate.GetType().Name)
                        });
                }
            }
            this.ContentType = "application/json";
            this.Method = "PATCH";
            var updatedEntity = await this.SendAsync<CloudCommunications>(cloudCommunicationsToUpdate, cancellationToken).ConfigureAwait(false);
            this.InitializeCollectionProperties(updatedEntity);
            return updatedEntity;
        }

        /// <summary>
        /// Adds the specified expand value to the request.
        /// </summary>
        /// <param name="value">The expand value.</param>
        /// <returns>The request object to send.</returns>
        public ICloudCommunicationsRequest Expand(string value)
        {
            this.QueryOptions.Add(new QueryOption("$expand", value));
            return this;
        }

        /// <summary>
        /// Adds the specified expand value to the request.
        /// </summary>
        /// <param name="expandExpression">The expression from which to calculate the expand value.</param>
        /// <returns>The request object to send.</returns>
        public ICloudCommunicationsRequest Expand(Expression<Func<CloudCommunications, object>> expandExpression)
        {
		    if (expandExpression == null)
            {
                throw new ArgumentNullException(nameof(expandExpression));
            }
            string error;
            string value = ExpressionExtractHelper.ExtractMembers(expandExpression, out error);
            if (value == null)
            {
                throw new ArgumentException(error, nameof(expandExpression));
            }
            else
            {
                this.QueryOptions.Add(new QueryOption("$expand", value));
            }
            return this;
        }

        /// <summary>
        /// Adds the specified select value to the request.
        /// </summary>
        /// <param name="value">The select value.</param>
        /// <returns>The request object to send.</returns>
        public ICloudCommunicationsRequest Select(string value)
        {
            this.QueryOptions.Add(new QueryOption("$select", value));
            return this;
        }

        /// <summary>
        /// Adds the specified select value to the request.
        /// </summary>
        /// <param name="selectExpression">The expression from which to calculate the select value.</param>
        /// <returns>The request object to send.</returns>
        public ICloudCommunicationsRequest Select(Expression<Func<CloudCommunications, object>> selectExpression)
        {
            if (selectExpression == null)
            {
                throw new ArgumentNullException(nameof(selectExpression));
            }
            string error;
            string value = ExpressionExtractHelper.ExtractMembers(selectExpression, out error);
            if (value == null)
            {
                throw new ArgumentException(error, nameof(selectExpression));
            }
            else
            {
                this.QueryOptions.Add(new QueryOption("$select", value));
            }
            return this;
        }

        /// <summary>
        /// Initializes any collection properties after deserialization, like next requests for paging.
        /// </summary>
        /// <param name="cloudCommunicationsToInitialize">The <see cref="CloudCommunications"/> with the collection properties to initialize.</param>
        private void InitializeCollectionProperties(CloudCommunications cloudCommunicationsToInitialize)
        {

            if (cloudCommunicationsToInitialize != null && cloudCommunicationsToInitialize.AdditionalData != null)
            {

                if (cloudCommunicationsToInitialize.Calls != null && cloudCommunicationsToInitialize.Calls.CurrentPage != null)
                {
                    cloudCommunicationsToInitialize.Calls.AdditionalData = cloudCommunicationsToInitialize.AdditionalData;

                    object nextPageLink;
                    cloudCommunicationsToInitialize.AdditionalData.TryGetValue("calls@odata.nextLink", out nextPageLink);
                    var nextPageLinkString = nextPageLink as string;

                    if (!string.IsNullOrEmpty(nextPageLinkString))
                    {
                        cloudCommunicationsToInitialize.Calls.InitializeNextPageRequest(
                            this.Client,
                            nextPageLinkString);
                    }
                }

                if (cloudCommunicationsToInitialize.CallRecords != null && cloudCommunicationsToInitialize.CallRecords.CurrentPage != null)
                {
                    cloudCommunicationsToInitialize.CallRecords.AdditionalData = cloudCommunicationsToInitialize.AdditionalData;

                    object nextPageLink;
                    cloudCommunicationsToInitialize.AdditionalData.TryGetValue("callRecords@odata.nextLink", out nextPageLink);
                    var nextPageLinkString = nextPageLink as string;

                    if (!string.IsNullOrEmpty(nextPageLinkString))
                    {
                        cloudCommunicationsToInitialize.CallRecords.InitializeNextPageRequest(
                            this.Client,
                            nextPageLinkString);
                    }
                }

            }


        }
    }
}
