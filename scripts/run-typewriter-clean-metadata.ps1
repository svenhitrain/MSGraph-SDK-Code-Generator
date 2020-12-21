# Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.

Write-Host "Running Typewriter..."
Push-Location -Path $env:TypewriterDirectory

# Note: I think we are only inserting the v1.0 docs. Need to verify.
& $env:TypewriterExecutable -v Info -m $env:InputMetadataFile -o $env:OutputPath -g $env:GenerationMode -t $env:Transform -d $env:DocsDirectory

Write-Host "Ran typewriter with the following command:"
Write-Host (Get-History | Select-Object -Last 1).CommandLine -ForegroundColor Green

Pop-Location