// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThumbsUpDouble: ImageVector
  get() {
    val current = _thumbsUpDouble
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ThumbsUpDouble",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20.76 14 H15 V9.57 C15 7.47 13.77 6 12 6 h-1 C9.47 6 9.25 7.53 9.12 8.35 l-.68 4.8 L6.4 17 H2 v13 h16.33 c3.68 0 6.67 -3 6.67 -6.67 v-5.1 c0 -2.34 -1.9 -4.23 -4.24 -4.23 M4 28 v-9 h2 v9z m19 -4.67 c0 2.58 -2.1 4.67 -4.67 4.67 H8 v-9.75 l2.37 -4.47 s.8 -5.6 .85 -5.78 H12 c.97 0 1 1.4 1 1.57 V16 h7.76 C22 16 23 17 23 18.23z m8 -10.1 v5.1 c0 2.32 -1.2 4.37 -3 5.56 l-1 -1.74 c1.2 -.84 2 -2.24 2 -3.82 v-5.1 c0 -1.24 -1 -2.23 -2.24 -2.23 H19 V4.57 C19 4.4 18.97 3 18 3 h-.78 l-.3 2 h-2.03 l.23 -1.65 C15.25 2.53 15.47 1 17 1 h1 c1.77 0 3 1.47 3 3.57 V9 h5.76 C29.1 9 31 10.9 31 13.23
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.76 14
          moveTo(x = 20.76f, y = 14.0f)
          // H 15
          horizontalLineTo(x = 15.0f)
          // V 9.57
          verticalLineTo(y = 9.57f)
          // C 15 7.47 13.77 6 12 6
          curveTo(
            x1 = 15.0f,
            y1 = 7.47f,
            x2 = 13.77f,
            y2 = 6.0f,
            x3 = 12.0f,
            y3 = 6.0f,
          )
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // C 9.47 6 9.25 7.53 9.12 8.35
          curveTo(
            x1 = 9.47f,
            y1 = 6.0f,
            x2 = 9.25f,
            y2 = 7.53f,
            x3 = 9.12f,
            y3 = 8.35f,
          )
          // l -0.68 4.8
          lineToRelative(dx = -0.68f, dy = 4.8f)
          // L 6.4 17
          lineTo(x = 6.4f, y = 17.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // h 16.33
          horizontalLineToRelative(dx = 16.33f)
          // c 3.68 0 6.67 -3 6.67 -6.67
          curveToRelative(
            dx1 = 3.68f,
            dy1 = 0.0f,
            dx2 = 6.67f,
            dy2 = -3.0f,
            dx3 = 6.67f,
            dy3 = -6.67f,
          )
          // v -5.1
          verticalLineToRelative(dy = -5.1f)
          // c 0 -2.34 -1.9 -4.23 -4.24 -4.23
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.34f,
            dx2 = -1.9f,
            dy2 = -4.23f,
            dx3 = -4.24f,
            dy3 = -4.23f,
          )
          // M 4 28
          moveTo(x = 4.0f, y = 28.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 9z
          verticalLineToRelative(dy = 9.0f)
          close()
          // m 19 -4.67
          moveToRelative(dx = 19.0f, dy = -4.67f)
          // c 0 2.58 -2.1 4.67 -4.67 4.67
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.58f,
            dx2 = -2.1f,
            dy2 = 4.67f,
            dx3 = -4.67f,
            dy3 = 4.67f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -9.75
          verticalLineToRelative(dy = -9.75f)
          // l 2.37 -4.47
          lineToRelative(dx = 2.37f, dy = -4.47f)
          // s 0.8 -5.6 0.85 -5.78
          reflectiveCurveToRelative(
            dx1 = 0.8f,
            dy1 = -5.6f,
            dx2 = 0.85f,
            dy2 = -5.78f,
          )
          // H 12
          horizontalLineTo(x = 12.0f)
          // c 0.97 0 1 1.4 1 1.57
          curveToRelative(
            dx1 = 0.97f,
            dy1 = 0.0f,
            dx2 = 1.0f,
            dy2 = 1.4f,
            dx3 = 1.0f,
            dy3 = 1.57f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // h 7.76
          horizontalLineToRelative(dx = 7.76f)
          // C 22 16 23 17 23 18.23z
          curveTo(
            x1 = 22.0f,
            y1 = 16.0f,
            x2 = 23.0f,
            y2 = 17.0f,
            x3 = 23.0f,
            y3 = 18.23f,
          )
          close()
          // m 8 -10.1
          moveToRelative(dx = 8.0f, dy = -10.1f)
          // v 5.1
          verticalLineToRelative(dy = 5.1f)
          // c 0 2.32 -1.2 4.37 -3 5.56
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.32f,
            dx2 = -1.2f,
            dy2 = 4.37f,
            dx3 = -3.0f,
            dy3 = 5.56f,
          )
          // l -1 -1.74
          lineToRelative(dx = -1.0f, dy = -1.74f)
          // c 1.2 -0.84 2 -2.24 2 -3.82
          curveToRelative(
            dx1 = 1.2f,
            dy1 = -0.84f,
            dx2 = 2.0f,
            dy2 = -2.24f,
            dx3 = 2.0f,
            dy3 = -3.82f,
          )
          // v -5.1
          verticalLineToRelative(dy = -5.1f)
          // c 0 -1.24 -1 -2.23 -2.24 -2.23
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.24f,
            dx2 = -1.0f,
            dy2 = -2.23f,
            dx3 = -2.24f,
            dy3 = -2.23f,
          )
          // H 19
          horizontalLineTo(x = 19.0f)
          // V 4.57
          verticalLineTo(y = 4.57f)
          // C 19 4.4 18.97 3 18 3
          curveTo(
            x1 = 19.0f,
            y1 = 4.4f,
            x2 = 18.97f,
            y2 = 3.0f,
            x3 = 18.0f,
            y3 = 3.0f,
          )
          // h -0.78
          horizontalLineToRelative(dx = -0.78f)
          // l -0.3 2
          lineToRelative(dx = -0.3f, dy = 2.0f)
          // h -2.03
          horizontalLineToRelative(dx = -2.03f)
          // l 0.23 -1.65
          lineToRelative(dx = 0.23f, dy = -1.65f)
          // C 15.25 2.53 15.47 1 17 1
          curveTo(
            x1 = 15.25f,
            y1 = 2.53f,
            x2 = 15.47f,
            y2 = 1.0f,
            x3 = 17.0f,
            y3 = 1.0f,
          )
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // c 1.77 0 3 1.47 3 3.57
          curveToRelative(
            dx1 = 1.77f,
            dy1 = 0.0f,
            dx2 = 3.0f,
            dy2 = 1.47f,
            dx3 = 3.0f,
            dy3 = 3.57f,
          )
          // V 9
          verticalLineTo(y = 9.0f)
          // h 5.76
          horizontalLineToRelative(dx = 5.76f)
          // C 29.1 9 31 10.9 31 13.23
          curveTo(
            x1 = 29.1f,
            y1 = 9.0f,
            x2 = 31.0f,
            y2 = 10.9f,
            x3 = 31.0f,
            y3 = 13.23f,
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
      .also { _thumbsUpDouble = it }
  }

@Suppress("ObjectPropertyName")
private var _thumbsUpDouble: ImageVector? = null
