// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentImport: ImageVector
  get() {
    val current = _documentImport
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DocumentImport",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="28.0 19.0 14.83 19.0 17.41 16.41 16.0 15.0 11.0 20.0 16.0 25.0 17.41 23.59 14.83 21.0 28.0 21.0 28.0 19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 19
          moveTo(x = 28.0f, y = 19.0f)
          // L 14.83 19
          lineTo(x = 14.83f, y = 19.0f)
          // L 17.41 16.41
          lineTo(x = 17.41f, y = 16.41f)
          // L 16 15
          lineTo(x = 16.0f, y = 15.0f)
          // L 11 20
          lineTo(x = 11.0f, y = 20.0f)
          // L 16 25
          lineTo(x = 16.0f, y = 25.0f)
          // L 17.41 23.59
          lineTo(x = 17.41f, y = 23.59f)
          // L 14.83 21
          lineTo(x = 14.83f, y = 21.0f)
          // L 28 21
          lineTo(x = 28.0f, y = 21.0f)
          // L 28 19z
          lineTo(x = 28.0f, y = 19.0f)
          close()
        }
        // M24 14 v-4 a1 1 0 0 0 -.29 -.71 l-7 -7 A1 1 0 0 0 16 2 H6 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-2 h-2 v2 H6 V4 h8 v6 a2 2 0 0 0 2 2 h6 v2Z m-8 -4 V4.41 L21.59 10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 14
          moveTo(x = 24.0f, y = 14.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 1 1 0 0 0 -0.29 -0.71
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.29f,
            dy1 = -0.71f,
          )
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // A 1 1 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
          close()
          // m -8 -4
          moveToRelative(dx = -8.0f, dy = -4.0f)
          // V 4.41
          verticalLineTo(y = 4.41f)
          // L 21.59 10z
          lineTo(x = 21.59f, y = 10.0f)
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
      .also { _documentImport = it }
  }

@Suppress("ObjectPropertyName")
private var _documentImport: ImageVector? = null
