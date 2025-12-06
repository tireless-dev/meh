// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ServerlessFleet: ImageVector
  get() {
    val current = _serverlessFleet
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ServerlessFleet",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="18.7 19.3 17.3 20.7 21.0 24.4 28.7 16.7 27.3 15.3 21.0 21.6 18.7 19.3" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.7 19.3
          moveTo(x = 18.7f, y = 19.3f)
          // L 17.3 20.7
          lineTo(x = 17.3f, y = 20.7f)
          // L 21 24.4
          lineTo(x = 21.0f, y = 24.4f)
          // L 28.7 16.7
          lineTo(x = 28.7f, y = 16.7f)
          // L 27.3 15.3
          lineTo(x = 27.3f, y = 15.3f)
          // L 21 21.6
          lineTo(x = 21.0f, y = 21.6f)
          // L 18.7 19.3z
          lineTo(x = 18.7f, y = 19.3f)
          close()
        }
        // M10 12 v11 a2 2 0 0 0 2 2 h4 v-2 h-4 V12 h8 v4 h2 v-4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 M4 4 h8 V2 H4 a2 2 0 0 0 -2 2 v8 h2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 12
          moveTo(x = 10.0f, y = 12.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // h -8
          horizontalLineToRelative(dx = -8.0f)
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
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 2
          verticalLineTo(y = 2.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // M6 8 v8 h2 V8 h8 V6 H8 a2 2 0 0 0 -2 2 m22 14 v6 H4 v-6 H2 v6 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 v-6z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 8
          moveTo(x = 6.0f, y = 8.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // m 22 14
          moveToRelative(dx = 22.0f, dy = 14.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // v -6z
          verticalLineToRelative(dy = -6.0f)
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
      .also { _serverlessFleet = it }
  }

@Suppress("ObjectPropertyName")
private var _serverlessFleet: ImageVector? = null
