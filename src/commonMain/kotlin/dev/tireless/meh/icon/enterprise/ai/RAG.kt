// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RAG: ImageVector
  get() {
    val current = _rAG
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RAG",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 28 h-2 a7 7 0 0 1 -7 -7 v-2 h2 v2 a5 5 0 0 0 5 5 h2z m16 -9 h-9 a2 2 0 0 0 -2 2 v5 a2 2 0 0 0 2 2 h3 v-2 h-3 v-5 h9 v5 h-2.54 l-2.59 3.9 1.67 1.1 2 -3 H28 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 0 -2 -2 m1 -4 v-4 a7 7 0 0 0 -7 -7 h-3 v2 h3 a5 5 0 0 1 5 5 v4z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 28
          moveTo(x = 12.0f, y = 28.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 7 7 0 0 1 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 5 5 0 0 0 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 16 -9
          moveToRelative(dx = 16.0f, dy = -9.0f)
          // h -9
          horizontalLineToRelative(dx = -9.0f)
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
          // v 5
          verticalLineToRelative(dy = 5.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -2.54
          horizontalLineToRelative(dx = -2.54f)
          // l -2.59 3.9
          lineToRelative(dx = -2.59f, dy = 3.9f)
          // l 1.67 1.1
          lineToRelative(dx = 1.67f, dy = 1.1f)
          // l 2 -3
          lineToRelative(dx = 2.0f, dy = -3.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
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
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m 1 -4
          moveToRelative(dx = 1.0f, dy = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 7 7 0 0 0 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 5 5 0 0 1 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
        }
        // <rect width="3" height="2" x="6.0" y="10.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 6 10
          moveTo(x = 6.0f, y = 10.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
        }
        // m12.6 6.44 -2.52 -3.69 A2 2 0 0 0 8.52 2 H4 a2 2 0 0 0 -2 2 v10 a2 2 0 0 0 2 2 h7 a2 2 0 0 0 2 -2 V7.63 c0 -.46 -.16 -.9 -.4 -1.2 M4 14 V4 h4 v3 a1 1 0 0 0 1 1 h2 v6z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.6 6.44
          moveTo(x = 12.6f, y = 6.44f)
          // l -2.52 -3.69
          lineToRelative(dx = -2.52f, dy = -3.69f)
          // A 2 2 0 0 0 8.52 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.52f,
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
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
          // h 7
          horizontalLineToRelative(dx = 7.0f)
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
          // V 7.63
          verticalLineTo(y = 7.63f)
          // c 0 -0.46 -0.16 -0.9 -0.4 -1.2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.46f,
            dx2 = -0.16f,
            dy2 = -0.9f,
            dx3 = -0.4f,
            dy3 = -1.2f,
          )
          // M 4 14
          moveTo(x = 4.0f, y = 14.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6z
          verticalLineToRelative(dy = 6.0f)
          close()
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
      .also { _rAG = it }
  }

@Suppress("ObjectPropertyName")
private var _rAG: ImageVector? = null
