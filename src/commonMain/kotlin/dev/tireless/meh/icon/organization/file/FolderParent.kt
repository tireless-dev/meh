// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderParent: ImageVector
  get() {
    val current = _folderParent
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FolderParent",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 8 H16 l-3.41 -3.41 A2 2 0 0 0 11.17 4 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h12 a2 2 0 0 0 2 -2 v-9.17 l2.59 2.58 L22 18 l-5 -5 -5 5 1.41 1.41 L16 16.83 V26 H4 V6 h7.17 l4 4 H28 v16 h-6 v2 h6 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 8
          moveTo(x = 28.0f, y = 8.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // l -3.41 -3.41
          lineToRelative(dx = -3.41f, dy = -3.41f)
          // A 2 2 0 0 0 11.17 4
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.17f,
            y1 = 4.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -9.17
          verticalLineToRelative(dy = -9.17f)
          // l 2.59 2.58
          lineToRelative(dx = 2.59f, dy = 2.58f)
          // L 22 18
          lineTo(x = 22.0f, y = 18.0f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 16 16.83
          lineTo(x = 16.0f, y = 16.83f)
          // V 26
          verticalLineTo(y = 26.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 7.17
          horizontalLineToRelative(dx = 7.17f)
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _folderParent = it }
  }

@Suppress("ObjectPropertyName")
private var _folderParent: ImageVector? = null
