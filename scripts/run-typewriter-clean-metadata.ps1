# Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.

Write-Host "Running Typewriter to clean the metadata..."
Push-Location -Path $env:TypewriterDirectory

# Note: I think we are only inserting the v1.0 docs. Need to verify.
& $env:TypewriterExecutable -v Info -m $env:InputMetadataFile -o $env:OutputPath -g $env:GenerationMode -t $env:Transform -d $env:DocsDirectory

Pop-Location