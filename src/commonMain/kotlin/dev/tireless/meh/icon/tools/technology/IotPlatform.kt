// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IotPlatform: ImageVector
  get() {
    val current = _iotPlatform
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.IotPlatform",
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
        // M21 21 H11 V11 h10Z m-8 -2 h6 v-6 h-6Z m18 -6 h-2 A10 10 0 0 0 19 3 V1 a12 12 0 0 1 12 12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 21
          moveTo(x = 21.0f, y = 21.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
          // m -8 -2
          moveToRelative(dx = -8.0f, dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
          // m 18 -6
          moveToRelative(dx = 18.0f, dy = -6.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // A 10 10 0 0 0 19 3
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 3.0f,
          )
          // V 1
          verticalLineTo(y = 1.0f)
          // a 12 12 0 0 1 12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
        }
        // M26 13 h-2 a5 5 0 0 0 -5 -5 V6 a7 7 0 0 1 7 7
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 13
          moveTo(x = 26.0f, y = 13.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // a 7 7 0 0 1 7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = 7.0f,
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
      .also { _iotPlatform = it }
  }

@Suppress("ObjectPropertyName")
private var _iotPlatform: ImageVector? = null
