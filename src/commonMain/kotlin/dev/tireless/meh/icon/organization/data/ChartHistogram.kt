// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartHistogram: ImageVector
  get() {
    val current = _chartHistogram
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartHistogram",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M6 16 c2.97 0 4.23 -2.25 5.34 -4.24 C12.47 9.74 13.45 8 16 8 s3.53 1.74 4.66 3.76 C21.76 13.75 23.03 16 26 16 h4 v-2 h-4 c-1.71 0 -2.48 -1.22 -3.6 -3.21 C21.2 8.65 19.72 6 16 6 s-5.2 2.65 -6.4 4.79 C8.48 12.78 7.7 14 6 14 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2 h-2 v-6 h-2 v6 h-4 v-8 h-2 v8 h-4 V16 h-2 v12 h-4 v-8 H8 v8 H4 V16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 16
          moveTo(x = 6.0f, y = 16.0f)
          // c 2.97 0 4.23 -2.25 5.34 -4.24
          curveToRelative(
            dx1 = 2.97f,
            dy1 = 0.0f,
            dx2 = 4.23f,
            dy2 = -2.25f,
            dx3 = 5.34f,
            dy3 = -4.24f,
          )
          // C 12.47 9.74 13.45 8 16 8
          curveTo(
            x1 = 12.47f,
            y1 = 9.74f,
            x2 = 13.45f,
            y2 = 8.0f,
            x3 = 16.0f,
            y3 = 8.0f,
          )
          // s 3.53 1.74 4.66 3.76
          reflectiveCurveToRelative(
            dx1 = 3.53f,
            dy1 = 1.74f,
            dx2 = 4.66f,
            dy2 = 3.76f,
          )
          // C 21.76 13.75 23.03 16 26 16
          curveTo(
            x1 = 21.76f,
            y1 = 13.75f,
            x2 = 23.03f,
            y2 = 16.0f,
            x3 = 26.0f,
            y3 = 16.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // c -1.71 0 -2.48 -1.22 -3.6 -3.21
          curveToRelative(
            dx1 = -1.71f,
            dy1 = 0.0f,
            dx2 = -2.48f,
            dy2 = -1.22f,
            dx3 = -3.6f,
            dy3 = -3.21f,
          )
          // C 21.2 8.65 19.72 6 16 6
          curveTo(
            x1 = 21.2f,
            y1 = 8.65f,
            x2 = 19.72f,
            y2 = 6.0f,
            x3 = 16.0f,
            y3 = 6.0f,
          )
          // s -5.2 2.65 -6.4 4.79
          reflectiveCurveToRelative(
            dx1 = -5.2f,
            dy1 = 2.65f,
            dx2 = -6.4f,
            dy2 = 4.79f,
          )
          // C 8.48 12.78 7.7 14 6 14
          curveTo(
            x1 = 8.48f,
            y1 = 12.78f,
            x2 = 7.7f,
            y2 = 14.0f,
            x3 = 6.0f,
            y3 = 14.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 26
          verticalLineToRelative(dy = 26.0f)
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
          // h 26
          horizontalLineToRelative(dx = 26.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 16z
          verticalLineTo(y = 16.0f)
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
      .also { _chartHistogram = it }
  }

@Suppress("ObjectPropertyName")
private var _chartHistogram: ImageVector? = null
