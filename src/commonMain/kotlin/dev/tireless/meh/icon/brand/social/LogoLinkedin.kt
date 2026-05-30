// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoLinkedin: ImageVector
  get() {
    val current = _logoLinkedin
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoLinkedin",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26.2 4 H5.8 C4.8 4 4 4.8 4 5.7 v20.5 c0 .9 .8 1.7 1.8 1.7 h20.4 c1 0 1.8 -.8 1.8 -1.7 V5.7 C28 4.8 27.2 4 26.2 4 M11.1 24.4 H7.6 V13 h3.5z m-1.7 -13 c-1.1 0 -2.1 -.9 -2.1 -2.1 s.9 -2.1 2.1 -2.1 c1.1 0 2.1 .9 2.1 2.1 s-1 2.1 -2.1 2.1 m15.1 12.9 H21 v-5.6 c0 -1.3 0 -3.1 -1.9 -3.1 S17 17.1 17 18.5 v5.7 h-3.5 V13 h3.3 v1.5 h.1 a3.9 3.9 0 0 1 3.4 -1.9 c3.6 0 4.3 2.4 4.3 5.5 v6.2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.2 4
          moveTo(x = 26.2f, y = 4.0f)
          // H 5.8
          horizontalLineTo(x = 5.8f)
          // C 4.8 4 4 4.8 4 5.7
          curveTo(
            x1 = 4.8f,
            y1 = 4.0f,
            x2 = 4.0f,
            y2 = 4.8f,
            x3 = 4.0f,
            y3 = 5.7f,
          )
          // v 20.5
          verticalLineToRelative(dy = 20.5f)
          // c 0 0.9 0.8 1.7 1.8 1.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.9f,
            dx2 = 0.8f,
            dy2 = 1.7f,
            dx3 = 1.8f,
            dy3 = 1.7f,
          )
          // h 20.4
          horizontalLineToRelative(dx = 20.4f)
          // c 1 0 1.8 -0.8 1.8 -1.7
          curveToRelative(
            dx1 = 1.0f,
            dy1 = 0.0f,
            dx2 = 1.8f,
            dy2 = -0.8f,
            dx3 = 1.8f,
            dy3 = -1.7f,
          )
          // V 5.7
          verticalLineTo(y = 5.7f)
          // C 28 4.8 27.2 4 26.2 4
          curveTo(
            x1 = 28.0f,
            y1 = 4.8f,
            x2 = 27.2f,
            y2 = 4.0f,
            x3 = 26.2f,
            y3 = 4.0f,
          )
          // M 11.1 24.4
          moveTo(x = 11.1f, y = 24.4f)
          // H 7.6
          horizontalLineTo(x = 7.6f)
          // V 13
          verticalLineTo(y = 13.0f)
          // h 3.5z
          horizontalLineToRelative(dx = 3.5f)
          close()
          // m -1.7 -13
          moveToRelative(dx = -1.7f, dy = -13.0f)
          // c -1.1 0 -2.1 -0.9 -2.1 -2.1
          curveToRelative(
            dx1 = -1.1f,
            dy1 = 0.0f,
            dx2 = -2.1f,
            dy2 = -0.9f,
            dx3 = -2.1f,
            dy3 = -2.1f,
          )
          // s 0.9 -2.1 2.1 -2.1
          reflectiveCurveToRelative(
            dx1 = 0.9f,
            dy1 = -2.1f,
            dx2 = 2.1f,
            dy2 = -2.1f,
          )
          // c 1.1 0 2.1 0.9 2.1 2.1
          curveToRelative(
            dx1 = 1.1f,
            dy1 = 0.0f,
            dx2 = 2.1f,
            dy2 = 0.9f,
            dx3 = 2.1f,
            dy3 = 2.1f,
          )
          // s -1 2.1 -2.1 2.1
          reflectiveCurveToRelative(
            dx1 = -1.0f,
            dy1 = 2.1f,
            dx2 = -2.1f,
            dy2 = 2.1f,
          )
          // m 15.1 12.9
          moveToRelative(dx = 15.1f, dy = 12.9f)
          // H 21
          horizontalLineTo(x = 21.0f)
          // v -5.6
          verticalLineToRelative(dy = -5.6f)
          // c 0 -1.3 0 -3.1 -1.9 -3.1
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.3f,
            dx2 = 0.0f,
            dy2 = -3.1f,
            dx3 = -1.9f,
            dy3 = -3.1f,
          )
          // S 17 17.1 17 18.5
          reflectiveCurveTo(
            x1 = 17.0f,
            y1 = 17.1f,
            x2 = 17.0f,
            y2 = 18.5f,
          )
          // v 5.7
          verticalLineToRelative(dy = 5.7f)
          // h -3.5
          horizontalLineToRelative(dx = -3.5f)
          // V 13
          verticalLineTo(y = 13.0f)
          // h 3.3
          horizontalLineToRelative(dx = 3.3f)
          // v 1.5
          verticalLineToRelative(dy = 1.5f)
          // h 0.1
          horizontalLineToRelative(dx = 0.1f)
          // a 3.9 3.9 0 0 1 3.4 -1.9
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.4f,
            dy1 = -1.9f,
          )
          // c 3.6 0 4.3 2.4 4.3 5.5
          curveToRelative(
            dx1 = 3.6f,
            dy1 = 0.0f,
            dx2 = 4.3f,
            dy2 = 2.4f,
            dx3 = 4.3f,
            dy3 = 5.5f,
          )
          // v 6.2z
          verticalLineToRelative(dy = 6.2f)
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
      .also { _logoLinkedin = it }
  }

@Suppress("ObjectPropertyName")
private var _logoLinkedin: ImageVector? = null
