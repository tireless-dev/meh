// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IotConnect: ImageVector
  get() {
    val current = _iotConnect
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.IotConnect",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 19 h-4 v-4 h-2 v9 H8 V8 h9 V6 h-4 V2 h-2 v4 H8 a2 2 0 0 0 -2 2 v3 H2 v2 h4 v6 H2 v2 h4 v3 a2 2 0 0 0 2 2 h3 v4 h2 v-4 h6 v4 h2 v-4 h3 a2 2 0 0 0 2 -2 v-3 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 19
          moveTo(x = 30.0f, y = 19.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
        }
        // M26 2 a4 4 0 0 0 -4 4 4 4 0 0 0 .57 2.02 L19.59 11 H11 v10 h10 v-8.59 l2.98 -2.98 A4 4 0 0 0 26 10 a4 4 0 0 0 0 -8 m-7 17 h-6 v-6 h6Z m7 -11 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 2
          moveTo(x = 26.0f, y = 2.0f)
          // a 4 4 0 0 0 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 0 0.57 2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.57f,
            dy1 = 2.02f,
          )
          // L 19.59 11
          lineTo(x = 19.59f, y = 11.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v -8.59
          verticalLineToRelative(dy = -8.59f)
          // l 2.98 -2.98
          lineToRelative(dx = 2.98f, dy = -2.98f)
          // A 4 4 0 0 0 26 10
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 10.0f,
          )
          // a 4 4 0 0 0 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // m -7 17
          moveToRelative(dx = -7.0f, dy = 17.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m 7 -11
          moveToRelative(dx = 7.0f, dy = -11.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
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
      .also { _iotConnect = it }
  }

@Suppress("ObjectPropertyName")
private var _iotConnect: ImageVector? = null
