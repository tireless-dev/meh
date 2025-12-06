// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentExport: ImageVector
  get() {
    val current = _documentExport
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DocumentExport",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="13.0 21.0 26.17 21.0 23.59 23.59 25.0 25.0 30.0 20.0 25.0 15.0 23.59 16.41 26.17 19.0 13.0 19.0 13.0 21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 21
          moveTo(x = 13.0f, y = 21.0f)
          // L 26.17 21
          lineTo(x = 26.17f, y = 21.0f)
          // L 23.59 23.59
          lineTo(x = 23.59f, y = 23.59f)
          // L 25 25
          lineTo(x = 25.0f, y = 25.0f)
          // L 30 20
          lineTo(x = 30.0f, y = 20.0f)
          // L 25 15
          lineTo(x = 25.0f, y = 15.0f)
          // L 23.59 16.41
          lineTo(x = 23.59f, y = 16.41f)
          // L 26.17 19
          lineTo(x = 26.17f, y = 19.0f)
          // L 13 19
          lineTo(x = 13.0f, y = 19.0f)
          // L 13 21z
          lineTo(x = 13.0f, y = 21.0f)
          close()
        }
        // M22 14 v-4 a1 1 0 0 0 -.29 -.71 l-7 -7 A1 1 0 0 0 14 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-2 h-2 v2 H4 V4 h8 v6 a2 2 0 0 0 2 2 h6 v2Z m-8 -4 V4.41 L19.59 10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 14
          moveTo(x = 22.0f, y = 14.0f)
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
          // A 1 1 0 0 0 14 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
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
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // L 19.59 10z
          lineTo(x = 19.59f, y = 10.0f)
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
      .also { _documentExport = it }
  }

@Suppress("ObjectPropertyName")
private var _documentExport: ImageVector? = null
