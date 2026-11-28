// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.FileUploader
import dev.tireless.meh.component.FileUploaderDropContainer
import dev.tireless.meh.component.FileUploaderItem
import dev.tireless.meh.component.LoadingStatus
import dev.tireless.meh.preview.PreviewInteractionState
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.preview.rememberPreviewInteractionSource
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun FileUploaderPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    val dropFocusSource = rememberPreviewInteractionSource(PreviewInteractionState.Focus)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "File Uploader & Drop Container", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing04),
        ) {
          FileUploader(
            label = "Upload files",
            description = "Max file size is 500kb. Supported file types are .jpg and .png.",
            buttonText = "Add files",
            onUploadClick = {},
          )
          FileUploaderDropContainer(
            labelText = "Drag and drop files here or click to upload",
            onClick = {},
          )
          FileUploaderDropContainer(
            labelText = "Focused drop container",
            onClick = {},
            interactionSource = dropFocusSource,
          )
        }

        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
        ) {
          BasicText(text = "File Items", style = sectionStyle)
          FileUploaderItem(
            fileName = "architecture-diagram.png",
            status = LoadingStatus.Active,
          )
          FileUploaderItem(
            fileName = "quarterly-report.pdf",
            status = LoadingStatus.Finished,
            onDeleteClick = {},
          )
          FileUploaderItem(
            fileName = "editable-draft.csv",
            status = LoadingStatus.Inactive,
            onDeleteClick = {},
          )
          FileUploaderItem(
            fileName = "oversized-video.mov",
            status = LoadingStatus.Error,
            errorSubject = "File size exceeds limit",
            errorBody = "500kb max file size. Select a new file and try again.",
            onDeleteClick = {},
          )
        }
      }
    }
  }
}
