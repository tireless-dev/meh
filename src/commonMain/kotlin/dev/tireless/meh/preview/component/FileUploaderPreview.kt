// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.tireless.meh.component.FileUploader
import dev.tireless.meh.component.FileUploaderItem
import dev.tireless.meh.component.LoadingStatus
import dev.tireless.meh.preview.PreviewTheme

@Preview(name = "FileUploader", showBackground = true)
@Composable
internal fun FileUploaderPreview() {
  PreviewTheme {
    Column(
      verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
      FileUploader(
        label = "Account photo",
        description = "Only .jpg and .png files. Max file size is 500kb.",
        buttonText = "Add file",
        onUploadClick = {},
      )
      FileUploaderItem(fileName = "photo.jpg")
      FileUploaderItem(fileName = "error.png", status = LoadingStatus.Error, onDeleteClick = {})
    }
  }
}
