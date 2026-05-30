// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderOpen: ImageVector
  get() {
    val current = _folderOpen
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FolderOpen",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 8 h-7.17 L17.4 4.59 A2 2 0 0 0 16 4 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2 M8 26 V14 h8 v6.17 l-2.59 -2.58 L12 19 l5 5 5 -5 -1.41 -1.41 L18 20.17 V14 a2 2 0 0 0 -2 -2 H8 a2 2 0 0 0 -2 2 v12 H4 V6 h12 l4 4 h8 v2 h-6 v2 h6 v12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 8
          moveTo(x = 28.0f, y = 8.0f)
          // h -7.17
          horizontalLineToRelative(dx = -7.17f)
          // L 17.4 4.59
          lineTo(x = 17.4f, y = 4.59f)
          // A 2 2 0 0 0 16 4
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // M 8 26
          moveTo(x = 8.0f, y = 26.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6.17
          verticalLineToRelative(dy = 6.17f)
          // l -2.59 -2.58
          lineToRelative(dx = -2.59f, dy = -2.58f)
          // L 12 19
          lineTo(x = 12.0f, y = 19.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 18 20.17
          lineTo(x = 18.0f, y = 20.17f)
          // V 14
          verticalLineTo(y = 14.0f)
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
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 12z
          verticalLineToRelative(dy = 12.0f)
          close()
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
      .also { _folderOpen = it }
  }

@Suppress("ObjectPropertyName")
private var _folderOpen: ImageVector? = null
