// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bottles01Dash: ImageVector
  get() {
    val current = _bottles01Dash
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Bottles01Dash",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 9.37 V3 a1 1 0 0 0 -1 -1 h-3 v2 h2 v6.72 s3 .5 3 4.28 v13 h-3 v2 h4 a1 1 0 0 0 1 -1 V15 c0 -3.45 -1.93 -5.02 -3 -5.63 m-7 0 V3 a1 1 0 0 0 -1 -1 h-3 v2 h2 v6.72 s3 .5 3 4.28 v13 h-3 v2 h4 a1 1 0 0 0 1 -1 V15 c0 -3.45 -1.93 -5.02 -3 -5.63 M13 28 h-3 v2 h4 a1 1 0 0 0 1 -1 v-4 h-2z m-8 -3 H3 v4 a1 1 0 0 0 1 1 h4 v-2 H5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 9.37
          moveTo(x = 26.0f, y = 9.37f)
          // V 3
          verticalLineTo(y = 3.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6.72
          verticalLineToRelative(dy = 6.72f)
          // s 3 0.5 3 4.28
          reflectiveCurveToRelative(
            dx1 = 3.0f,
            dy1 = 0.5f,
            dx2 = 3.0f,
            dy2 = 4.28f,
          )
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 15
          verticalLineTo(y = 15.0f)
          // c 0 -3.45 -1.93 -5.02 -3 -5.63
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.45f,
            dx2 = -1.93f,
            dy2 = -5.02f,
            dx3 = -3.0f,
            dy3 = -5.63f,
          )
          // m -7 0
          moveToRelative(dx = -7.0f, dy = 0.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6.72
          verticalLineToRelative(dy = 6.72f)
          // s 3 0.5 3 4.28
          reflectiveCurveToRelative(
            dx1 = 3.0f,
            dy1 = 0.5f,
            dx2 = 3.0f,
            dy2 = 4.28f,
          )
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 15
          verticalLineTo(y = 15.0f)
          // c 0 -3.45 -1.93 -5.02 -3 -5.63
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.45f,
            dx2 = -1.93f,
            dy2 = -5.02f,
            dx3 = -3.0f,
            dy3 = -5.63f,
          )
          // M 13 28
          moveTo(x = 13.0f, y = 28.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m -8 -3
          moveToRelative(dx = -8.0f, dy = -3.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 5z
          horizontalLineTo(x = 5.0f)
          close()
        }
        // <rect width="2" height="5" x="13.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 18
          moveTo(x = 13.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="5" x="3.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 3 18
          moveTo(x = 3.0f, y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M12 9.37 V3 a1 1 0 0 0 -1 -1 H7 a1 1 0 0 0 -1 1 v6.37 C4.93 9.97 3 11.55 3 15 v1 h2 v-1 c0 -3.77 3 -4.28 3 -4.28 V4 h2 v6.72 s3 .5 3 4.28 v1 h2 v-1 c0 -3.45 -1.93 -5.02 -3 -5.63
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 9.37
          moveTo(x = 12.0f, y = 9.37f)
          // V 3
          verticalLineTo(y = 3.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // H 7
          horizontalLineTo(x = 7.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 6.37
          verticalLineToRelative(dy = 6.37f)
          // C 4.93 9.97 3 11.55 3 15
          curveTo(
            x1 = 4.93f,
            y1 = 9.97f,
            x2 = 3.0f,
            y2 = 11.55f,
            x3 = 3.0f,
            y3 = 15.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // c 0 -3.77 3 -4.28 3 -4.28
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.77f,
            dx2 = 3.0f,
            dy2 = -4.28f,
            dx3 = 3.0f,
            dy3 = -4.28f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6.72
          verticalLineToRelative(dy = 6.72f)
          // s 3 0.5 3 4.28
          reflectiveCurveToRelative(
            dx1 = 3.0f,
            dy1 = 0.5f,
            dx2 = 3.0f,
            dy2 = 4.28f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // c 0 -3.45 -1.93 -5.02 -3 -5.63
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.45f,
          dx2 = -1.93f,
          dy2 = -5.02f,
          dx3 = -3.0f,
          dy3 = -5.63f,
        )
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
      .also { _bottles01Dash = it }
  }

@Suppress("ObjectPropertyName")
private var _bottles01Dash: ImageVector? = null
