// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextLink: ImageVector
  get() {
    val current = _textLink
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextLink",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18.7 27.59 a5.26 5.26 0 0 1 -3.72 -8.99 l1.42 1.42 A3.26 3.26 0 1 0 21 24.63 l6.03 -6.03 A3.26 3.26 0 0 0 22.43 14 L21 12.57 a5.26 5.26 0 0 1 7.45 7.45 l-6.03 6.03 a5.3 5.3 0 0 1 -3.72 1.54
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.7 27.59
          moveTo(x = 18.7f, y = 27.59f)
          // a 5.26 5.26 0 0 1 -3.72 -8.99
          arcToRelative(
            a = 5.26f,
            b = 5.26f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.72f,
            dy1 = -8.99f,
          )
          // l 1.42 1.42
          lineToRelative(dx = 1.42f, dy = 1.42f)
          // A 3.26 3.26 0 1 0 21 24.63
          arcTo(
            horizontalEllipseRadius = 3.26f,
            verticalEllipseRadius = 3.26f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 24.63f,
          )
          // l 6.03 -6.03
          lineToRelative(dx = 6.03f, dy = -6.03f)
          // A 3.26 3.26 0 0 0 22.43 14
          arcTo(
            horizontalEllipseRadius = 3.26f,
            verticalEllipseRadius = 3.26f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.43f,
            y1 = 14.0f,
          )
          // L 21 12.57
          lineTo(x = 21.0f, y = 12.57f)
          // a 5.26 5.26 0 0 1 7.45 7.45
          arcToRelative(
            a = 5.26f,
            b = 5.26f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.45f,
            dy1 = 7.45f,
          )
          // l -6.03 6.03
          lineToRelative(dx = -6.03f, dy = 6.03f)
          // a 5.3 5.3 0 0 1 -3.72 1.54
          arcToRelative(
            a = 5.3f,
            b = 5.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.72f,
            dy1 = 1.54f,
          )
        }
        // M10.26 30 A5.26 5.26 0 0 1 6.54 21 l6.03 -6.03 a5.26 5.26 0 1 1 7.45 7.45 L18.6 21 A3.26 3.26 0 1 0 14 16.4 l-6.03 6.03 a3.26 3.26 0 0 0 4.61 4.61 L14 28.46 A5.3 5.3 0 0 1 10.26 30
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.26 30
          moveTo(x = 10.26f, y = 30.0f)
          // A 5.26 5.26 0 0 1 6.54 21
          arcTo(
            horizontalEllipseRadius = 5.26f,
            verticalEllipseRadius = 5.26f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.54f,
            y1 = 21.0f,
          )
          // l 6.03 -6.03
          lineToRelative(dx = 6.03f, dy = -6.03f)
          // a 5.26 5.26 0 1 1 7.45 7.45
          arcToRelative(
            a = 5.26f,
            b = 5.26f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 7.45f,
            dy1 = 7.45f,
          )
          // L 18.6 21
          lineTo(x = 18.6f, y = 21.0f)
          // A 3.26 3.26 0 1 0 14 16.4
          arcTo(
            horizontalEllipseRadius = 3.26f,
            verticalEllipseRadius = 3.26f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 16.4f,
          )
          // l -6.03 6.03
          lineToRelative(dx = -6.03f, dy = 6.03f)
          // a 3.26 3.26 0 0 0 4.61 4.61
          arcToRelative(
            a = 3.26f,
            b = 3.26f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.61f,
            dy1 = 4.61f,
          )
          // L 14 28.46
          lineTo(x = 14.0f, y = 28.46f)
          // A 5.3 5.3 0 0 1 10.26 30
          arcTo(
            horizontalEllipseRadius = 5.3f,
            verticalEllipseRadius = 5.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.26f,
            y1 = 30.0f,
          )
        }
        // <rect width="8" height="2" x="2.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 10
          moveTo(x = 2.0f, y = 10.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="12" height="2" x="2.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 6
          moveTo(x = 2.0f, y = 6.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="2.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 2
          moveTo(x = 2.0f, y = 2.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
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
      .also { _textLink = it }
  }

@Suppress("ObjectPropertyName")
private var _textLink: ImageVector? = null
