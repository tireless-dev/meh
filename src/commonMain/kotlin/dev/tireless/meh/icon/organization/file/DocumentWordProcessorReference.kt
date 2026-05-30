// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentWordProcessorReference: ImageVector
  get() {
    val current = _documentWordProcessorReference
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DocumentWordProcessorReference",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="28.3 20.0 27.391 28.611 26.0 20.0 24.0 20.0 22.609 28.611 21.7 20.0 20.0 20.0 21.36 30.0 23.64 30.0 25.0 21.626 26.36 30.0 28.64 30.0 30.0 20.0 28.3 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.3 20
          moveTo(x = 28.3f, y = 20.0f)
          // L 27.391 28.611
          lineTo(x = 27.391f, y = 28.611f)
          // L 26 20
          lineTo(x = 26.0f, y = 20.0f)
          // L 24 20
          lineTo(x = 24.0f, y = 20.0f)
          // L 22.609 28.611
          lineTo(x = 22.609f, y = 28.611f)
          // L 21.7 20
          lineTo(x = 21.7f, y = 20.0f)
          // L 20 20
          lineTo(x = 20.0f, y = 20.0f)
          // L 21.36 30
          lineTo(x = 21.36f, y = 30.0f)
          // L 23.64 30
          lineTo(x = 23.64f, y = 30.0f)
          // L 25 21.626
          lineTo(x = 25.0f, y = 21.626f)
          // L 26.36 30
          lineTo(x = 26.36f, y = 30.0f)
          // L 28.64 30
          lineTo(x = 28.64f, y = 30.0f)
          // L 30 20
          lineTo(x = 30.0f, y = 20.0f)
          // L 28.3 20z
          lineTo(x = 28.3f, y = 20.0f)
          close()
        }
        // <polygon points="4.0 20.0 4.0 22.0 8.586 22.0 2.0 28.586 3.414 30.0 10.0 23.414 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // L 4 22
          lineTo(x = 4.0f, y = 22.0f)
          // L 8.586 22
          lineTo(x = 8.586f, y = 22.0f)
          // L 2 28.586
          lineTo(x = 2.0f, y = 28.586f)
          // L 3.414 30
          lineTo(x = 3.414f, y = 30.0f)
          // L 10 23.414
          lineTo(x = 10.0f, y = 23.414f)
          // L 10 28
          lineTo(x = 10.0f, y = 28.0f)
          // L 12 28
          lineTo(x = 12.0f, y = 28.0f)
          // L 12 20
          lineTo(x = 12.0f, y = 20.0f)
          // L 4 20z
          lineTo(x = 4.0f, y = 20.0f)
          close()
        }
        // m25.7 9.3 -7 -7 A1 1 0 0 0 18 2 H8 a2 2 0 0 0 -2 2 v12 h2 V4 h8 v6 a2 2 0 0 0 2 2 h6 v4 h2 v-6 a1 1 0 0 0 -.3 -.7 M18 10 V4.41 L23.59 10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.7 9.3
          moveTo(x = 25.7f, y = 9.3f)
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // A 1 1 0 0 0 18 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 2.0f,
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 1 1 0 0 0 -0.3 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -0.7f,
          )
          // M 18 10
          moveTo(x = 18.0f, y = 10.0f)
          // V 4.41
          verticalLineTo(y = 4.41f)
          // L 23.59 10z
          lineTo(x = 23.59f, y = 10.0f)
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
      .also { _documentWordProcessorReference = it }
  }

@Suppress("ObjectPropertyName")
private var _documentWordProcessorReference: ImageVector? = null
