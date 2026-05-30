// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bottles01: ImageVector
  get() {
    val current = _bottles01
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Bottles01",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 9.37 V3 a1 1 0 0 0 -1 -1 h-3 v2 h2 v6.72 s3 .5 3 4.28 v13 h-3 v2 h4 a1 1 0 0 0 1 -1 V15 c0 -3.45 -1.93 -5.02 -3 -5.63 m-7 0 V3 a1 1 0 0 0 -1 -1 h-3 v2 h2 v6.72 s3 .5 3 4.28 v13 h-3 v2 h4 a1 1 0 0 0 1 -1 V15 c0 -3.45 -1.93 -5.02 -3 -5.63 m-7 0 V3 a1 1 0 0 0 -1 -1 H7 a1 1 0 0 0 -1 1 v6.37 C4.93 9.97 3 11.55 3 15 v14 a1 1 0 0 0 1 1 h10 a1 1 0 0 0 1 -1 V15 c0 -3.45 -1.93 -5.02 -3 -5.63 M13 28 H5 V15 c0 -3.77 3 -4.28 3 -4.28 V4 h2 v6.72 s3 .5 3 4.28z
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
          // v 14
          verticalLineToRelative(dy = 14.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 15
          verticalLineTo(y = 15.0f)
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
          // s 3 0.5 3 4.28z
          reflectiveCurveToRelative(
            dx1 = 3.0f,
            dy1 = 0.5f,
            dx2 = 3.0f,
            dy2 = 4.28f,
          )
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
      .also { _bottles01 = it }
  }

@Suppress("ObjectPropertyName")
private var _bottles01: ImageVector? = null
