// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ContentView: ImageVector
  get() {
    val current = _contentView
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ContentView",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="19.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 19
          moveTo(x = 16.0f, y = 19.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M23.78 18.48 A8.6 8.6 0 0 0 16 13 a8.6 8.6 0 0 0 -7.78 5.48 L8 19 l.22 .52 A8.6 8.6 0 0 0 16 25 a8.6 8.6 0 0 0 7.78 -5.48 L24 19Z M16 23 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.78 18.48
          moveTo(x = 23.78f, y = 18.48f)
          // A 8.6 8.6 0 0 0 16 13
          arcTo(
            horizontalEllipseRadius = 8.6f,
            verticalEllipseRadius = 8.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 13.0f,
          )
          // a 8.6 8.6 0 0 0 -7.78 5.48
          arcToRelative(
            a = 8.6f,
            b = 8.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.78f,
            dy1 = 5.48f,
          )
          // L 8 19
          lineTo(x = 8.0f, y = 19.0f)
          // l 0.22 0.52
          lineToRelative(dx = 0.22f, dy = 0.52f)
          // A 8.6 8.6 0 0 0 16 25
          arcTo(
            horizontalEllipseRadius = 8.6f,
            verticalEllipseRadius = 8.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 25.0f,
          )
          // a 8.6 8.6 0 0 0 7.78 -5.48
          arcToRelative(
            a = 8.6f,
            b = 8.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.78f,
            dy1 = -5.48f,
          )
          // L 24 19z
          lineTo(x = 24.0f, y = 19.0f)
          close()
          // M 16 23
          moveTo(x = 16.0f, y = 23.0f)
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
        }
        // M27 3 H5 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h22 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 M5 5 h22 v4 H5Z m0 22 V11 h22 v16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 3
          moveTo(x = 27.0f, y = 3.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
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
          // v 22
          verticalLineToRelative(dy = 22.0f)
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
          // h 22
          horizontalLineToRelative(dx = 22.0f)
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
          // V 5
          verticalLineTo(y = 5.0f)
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
          // M 5 5
          moveTo(x = 5.0f, y = 5.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 5z
          horizontalLineTo(x = 5.0f)
          close()
          // m 0 22
          moveToRelative(dx = 0.0f, dy = 22.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // v 16z
          verticalLineToRelative(dy = 16.0f)
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
      .also { _contentView = it }
  }

@Suppress("ObjectPropertyName")
private var _contentView: ImageVector? = null
