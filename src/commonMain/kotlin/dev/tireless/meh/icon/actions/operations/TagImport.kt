// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TagImport: ImageVector
  get() {
    val current = _tagImport
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TagImport",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.0 18.0 22.0 12.0 23.414 13.414 19.828 17.0 30.0 17.0 30.0 19.0 19.828 19.0 23.414 22.586 22.0 24.0 16.0 18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 18
          moveTo(x = 16.0f, y = 18.0f)
          // L 22 12
          lineTo(x = 22.0f, y = 12.0f)
          // L 23.414 13.414
          lineTo(x = 23.414f, y = 13.414f)
          // L 19.828 17
          lineTo(x = 19.828f, y = 17.0f)
          // L 30 17
          lineTo(x = 30.0f, y = 17.0f)
          // L 30 19
          lineTo(x = 30.0f, y = 19.0f)
          // L 19.828 19
          lineTo(x = 19.828f, y = 19.0f)
          // L 23.414 22.586
          lineTo(x = 23.414f, y = 22.586f)
          // L 22 24
          lineTo(x = 22.0f, y = 24.0f)
          // L 16 18z
          lineTo(x = 16.0f, y = 18.0f)
          close()
        }
        // M10 14 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 14
          moveTo(x = 10.0f, y = 14.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
        // m20.06 26 -2 2 L4 13.94 V4 h9.94 l6 6 1.42 -1.41 -6 -6 A2 2 0 0 0 13.94 2 H4 a2 2 0 0 0 -2 2 v9.94 a2 2 0 0 0 .59 1.42 L16.64 29.4 a2 2 0 0 0 2.83 0 l2 -2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.06 26
          moveTo(x = 20.06f, y = 26.0f)
          // l -2 2
          lineToRelative(dx = -2.0f, dy = 2.0f)
          // L 4 13.94
          lineTo(x = 4.0f, y = 13.94f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 9.94
          horizontalLineToRelative(dx = 9.94f)
          // l 6 6
          lineToRelative(dx = 6.0f, dy = 6.0f)
          // l 1.42 -1.41
          lineToRelative(dx = 1.42f, dy = -1.41f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // A 2 2 0 0 0 13.94 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.94f,
            y1 = 2.0f,
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
          // v 9.94
          verticalLineToRelative(dy = 9.94f)
          // a 2 2 0 0 0 0.59 1.42
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.59f,
            dy1 = 1.42f,
          )
          // L 16.64 29.4
          lineTo(x = 16.64f, y = 29.4f)
          // a 2 2 0 0 0 2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.83f,
            dy1 = 0.0f,
          )
          // l 2 -2z
          lineToRelative(dx = 2.0f, dy = -2.0f)
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
      .also { _tagImport = it }
  }

@Suppress("ObjectPropertyName")
private var _tagImport: ImageVector? = null
