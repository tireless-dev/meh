// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderAdd: ImageVector
  get() {
    val current = _folderAdd
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FolderAdd",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="26.0 20.0 24.0 20.0 24.0 24.0 20.0 24.0 20.0 26.0 24.0 26.0 24.0 30.0 26.0 30.0 26.0 26.0 30.0 26.0 30.0 24.0 26.0 24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 20
          moveTo(x = 26.0f, y = 20.0f)
          // L 24 20
          lineTo(x = 24.0f, y = 20.0f)
          // L 24 24
          lineTo(x = 24.0f, y = 24.0f)
          // L 20 24
          lineTo(x = 20.0f, y = 24.0f)
          // L 20 26
          lineTo(x = 20.0f, y = 26.0f)
          // L 24 26
          lineTo(x = 24.0f, y = 26.0f)
          // L 24 30
          lineTo(x = 24.0f, y = 30.0f)
          // L 26 30
          lineTo(x = 26.0f, y = 30.0f)
          // L 26 26
          lineTo(x = 26.0f, y = 26.0f)
          // L 30 26
          lineTo(x = 30.0f, y = 26.0f)
          // L 30 24
          lineTo(x = 30.0f, y = 24.0f)
          // L 26 24z
          lineTo(x = 26.0f, y = 24.0f)
          close()
        }
        // M28 8 H16 l-3.4 -3.4 A2 2 0 0 0 11.2 4 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h14 v-2 H4 V6 h7.2 l3.4 3.4 .6 .6 H28 v8 h2 v-8 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 8
          moveTo(x = 28.0f, y = 8.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // l -3.4 -3.4
          lineToRelative(dx = -3.4f, dy = -3.4f)
          // A 2 2 0 0 0 11.2 4
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.2f,
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
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 7.2
          horizontalLineToRelative(dx = 7.2f)
          // l 3.4 3.4
          lineToRelative(dx = 3.4f, dy = 3.4f)
          // l 0.6 0.6
          lineToRelative(dx = 0.6f, dy = 0.6f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
      .also { _folderAdd = it }
  }

@Suppress("ObjectPropertyName")
private var _folderAdd: ImageVector? = null
