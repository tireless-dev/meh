// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Avro: ImageVector
  get() {
    val current = _avro
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Avro",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M5 11 H3 a2 2 0 0 0 -2 2 v8 h2 v-4 h2 v4 h2 v-8 a2 2 0 0 0 -2 -2 m0 4 H3 v-2 h2z m16 -4 h-4 v10 h2 v-4 h.4 l1.6 4 h2 l-1.6 -4 c.9 -.2 1.6 -1 1.6 -2 v-2 a2 2 0 0 0 -2 -2 m0 4 h-2 v-2 h2z m-9 3 -1 -7 H9 l2 10 h2 l2 -10 h-2z m17 -7 h-2 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h2 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m0 8 h-2 v-6 h2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5 11
          moveTo(x = 5.0f, y = 11.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 16 -4
          moveToRelative(dx = 16.0f, dy = -4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 0.4
          horizontalLineToRelative(dx = 0.4f)
          // l 1.6 4
          lineToRelative(dx = 1.6f, dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l -1.6 -4
          lineToRelative(dx = -1.6f, dy = -4.0f)
          // c 0.9 -0.2 1.6 -1 1.6 -2
          curveToRelative(
            dx1 = 0.9f,
            dy1 = -0.2f,
            dx2 = 1.6f,
            dy2 = -1.0f,
            dx3 = 1.6f,
            dy3 = -2.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m -9 3
          moveToRelative(dx = -9.0f, dy = 3.0f)
          // l -1 -7
          lineToRelative(dx = -1.0f, dy = -7.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // l 2 10
          lineToRelative(dx = 2.0f, dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l 2 -10
          lineToRelative(dx = 2.0f, dy = -10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m 17 -7
          moveToRelative(dx = 17.0f, dy = -7.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // m 0 8
          moveToRelative(dx = 0.0f, dy = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // <polyline points="32.0 32.0 0.0 32.0 0.0 0.0 32.0 0.0" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // L 0 32
          lineTo(x = 0.0f, y = 32.0f)
          // L 0 0
          lineTo(x = 0.0f, y = 0.0f)
          // L 32 0
          lineTo(x = 32.0f, y = 0.0f)
        }
      }.build()
      .also { _avro = it }
  }

@Suppress("ObjectPropertyName")
private var _avro: ImageVector? = null
