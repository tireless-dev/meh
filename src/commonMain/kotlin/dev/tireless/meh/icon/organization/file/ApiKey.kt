// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ApiKey: ImageVector
  get() {
    val current = _apiKey
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ApiKey",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 26 a2 2 0 0 0 -.51 .07 l-1.06 -1.05 C26.78 24.42 27 23.74 27 23 s-.22 -1.42 -.57 -2.02 l1.06 -1.05 a2 2 0 1 0 -1.41 -1.41 l-1.06 1.05 C24.42 19.22 23.74 19 23 19 s-1.42 .22 -2.02 .57 l-1.05 -1.06 a2 2 0 1 0 -1.41 1.41 l1.05 1.06 C19.22 21.58 19 22.26 19 23 s.22 1.42 .57 2.02 l-1.06 1.05 a2 2 0 1 0 1.41 1.41 l1.06 -1.05 C21.58 26.78 22.26 27 23 27 s1.42 -.22 2.02 -.57 l1.05 1.06 A2 2 0 1 0 28 26 m-7 -3 a2 2 0 1 1 4 0 2 2 0 0 1 -4 0
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 26
          moveTo(x = 28.0f, y = 26.0f)
          // a 2 2 0 0 0 -0.51 0.07
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.51f,
            dy1 = 0.07f,
          )
          // l -1.06 -1.05
          lineToRelative(dx = -1.06f, dy = -1.05f)
          // C 26.78 24.42 27 23.74 27 23
          curveTo(
            x1 = 26.78f,
            y1 = 24.42f,
            x2 = 27.0f,
            y2 = 23.74f,
            x3 = 27.0f,
            y3 = 23.0f,
          )
          // s -0.22 -1.42 -0.57 -2.02
          reflectiveCurveToRelative(
            dx1 = -0.22f,
            dy1 = -1.42f,
            dx2 = -0.57f,
            dy2 = -2.02f,
          )
          // l 1.06 -1.05
          lineToRelative(dx = 1.06f, dy = -1.05f)
          // a 2 2 0 1 0 -1.41 -1.41
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.41f,
            dy1 = -1.41f,
          )
          // l -1.06 1.05
          lineToRelative(dx = -1.06f, dy = 1.05f)
          // C 24.42 19.22 23.74 19 23 19
          curveTo(
            x1 = 24.42f,
            y1 = 19.22f,
            x2 = 23.74f,
            y2 = 19.0f,
            x3 = 23.0f,
            y3 = 19.0f,
          )
          // s -1.42 0.22 -2.02 0.57
          reflectiveCurveToRelative(
            dx1 = -1.42f,
            dy1 = 0.22f,
            dx2 = -2.02f,
            dy2 = 0.57f,
          )
          // l -1.05 -1.06
          lineToRelative(dx = -1.05f, dy = -1.06f)
          // a 2 2 0 1 0 -1.41 1.41
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.41f,
            dy1 = 1.41f,
          )
          // l 1.05 1.06
          lineToRelative(dx = 1.05f, dy = 1.06f)
          // C 19.22 21.58 19 22.26 19 23
          curveTo(
            x1 = 19.22f,
            y1 = 21.58f,
            x2 = 19.0f,
            y2 = 22.26f,
            x3 = 19.0f,
            y3 = 23.0f,
          )
          // s 0.22 1.42 0.57 2.02
          reflectiveCurveToRelative(
            dx1 = 0.22f,
            dy1 = 1.42f,
            dx2 = 0.57f,
            dy2 = 2.02f,
          )
          // l -1.06 1.05
          lineToRelative(dx = -1.06f, dy = 1.05f)
          // a 2 2 0 1 0 1.41 1.41
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.41f,
            dy1 = 1.41f,
          )
          // l 1.06 -1.05
          lineToRelative(dx = 1.06f, dy = -1.05f)
          // C 21.58 26.78 22.26 27 23 27
          curveTo(
            x1 = 21.58f,
            y1 = 26.78f,
            x2 = 22.26f,
            y2 = 27.0f,
            x3 = 23.0f,
            y3 = 27.0f,
          )
          // s 1.42 -0.22 2.02 -0.57
          reflectiveCurveToRelative(
            dx1 = 1.42f,
            dy1 = -0.22f,
            dx2 = 2.02f,
            dy2 = -0.57f,
          )
          // l 1.05 1.06
          lineToRelative(dx = 1.05f, dy = 1.06f)
          // A 2 2 0 1 0 28 26
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 26.0f,
          )
          // m -7 -3
          moveToRelative(dx = -7.0f, dy = -3.0f)
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
          // a 2 2 0 0 1 -4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
        }
        // <circle cx="22.0" cy="10.0" radius="2.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 22 10
          moveTo(x = 22.0f, y = 10.0f)
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
        // M21 2 a9 9 0 0 0 -8.7 11.3 L2 23.58 V30 h6.41 l7 -7 -2.7 -2.7 -1.42 1.4 1.3 1.3 -1.6 1.59 -1.28 -1.3 -1.42 1.42 L9.6 26 l-2 1.99 H4 v-3.59 l9.71 -9.7 .86 -.88 -.2 -.58 A7 7 0 1 1 28 11 h2 c0 -4.96 -4.04 -9 -9 -9
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 2
          moveTo(x = 21.0f, y = 2.0f)
          // a 9 9 0 0 0 -8.7 11.3
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.7f,
            dy1 = 11.3f,
          )
          // L 2 23.58
          lineTo(x = 2.0f, y = 23.58f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 6.41
          horizontalLineToRelative(dx = 6.41f)
          // l 7 -7
          lineToRelative(dx = 7.0f, dy = -7.0f)
          // l -2.7 -2.7
          lineToRelative(dx = -2.7f, dy = -2.7f)
          // l -1.42 1.4
          lineToRelative(dx = -1.42f, dy = 1.4f)
          // l 1.3 1.3
          lineToRelative(dx = 1.3f, dy = 1.3f)
          // l -1.6 1.59
          lineToRelative(dx = -1.6f, dy = 1.59f)
          // l -1.28 -1.3
          lineToRelative(dx = -1.28f, dy = -1.3f)
          // l -1.42 1.42
          lineToRelative(dx = -1.42f, dy = 1.42f)
          // L 9.6 26
          lineTo(x = 9.6f, y = 26.0f)
          // l -2 1.99
          lineToRelative(dx = -2.0f, dy = 1.99f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -3.59
          verticalLineToRelative(dy = -3.59f)
          // l 9.71 -9.7
          lineToRelative(dx = 9.71f, dy = -9.7f)
          // l 0.86 -0.88
          lineToRelative(dx = 0.86f, dy = -0.88f)
          // l -0.2 -0.58
          lineToRelative(dx = -0.2f, dy = -0.58f)
          // A 7 7 0 1 1 28 11
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 11.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // c 0 -4.96 -4.04 -9 -9 -9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.96f,
            dx2 = -4.04f,
            dy2 = -9.0f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _apiKey = it }
  }

@Suppress("ObjectPropertyName")
private var _apiKey: ImageVector? = null
