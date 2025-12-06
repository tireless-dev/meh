// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Event: ImageVector
  get() {
    val current = _event
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Event",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 6 a2 2 0 0 0 -2 -2 h-4 V2 h-2 v2 h-8 V2 h-2 v2 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h4 v-2 H6 V6 h4 v2 h2 V6 h8 v2 h2 V6 h4 v6 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
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
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // <polygon points="21.0 15.0 23.549 19.938 29.0 20.729 25.0 24.573 26.0 30.0 21.0 27.438 16.0 30.0 17.0 24.573 13.0 20.729 18.6 19.938 21.0 15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 15
          moveTo(x = 21.0f, y = 15.0f)
          // L 23.549 19.938
          lineTo(x = 23.549f, y = 19.938f)
          // L 29 20.729
          lineTo(x = 29.0f, y = 20.729f)
          // L 25 24.573
          lineTo(x = 25.0f, y = 24.573f)
          // L 26 30
          lineTo(x = 26.0f, y = 30.0f)
          // L 21 27.438
          lineTo(x = 21.0f, y = 27.438f)
          // L 16 30
          lineTo(x = 16.0f, y = 30.0f)
          // L 17 24.573
          lineTo(x = 17.0f, y = 24.573f)
          // L 13 20.729
          lineTo(x = 13.0f, y = 20.729f)
          // L 18.6 19.938
          lineTo(x = 18.6f, y = 19.938f)
          // L 21 15z
          lineTo(x = 21.0f, y = 15.0f)
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
      .also { _event = it }
  }

@Suppress("ObjectPropertyName")
private var _event: ImageVector? = null
