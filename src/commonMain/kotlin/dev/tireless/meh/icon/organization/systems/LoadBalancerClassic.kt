// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LoadBalancerClassic: ImageVector
  get() {
    val current = _loadBalancerClassic
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LoadBalancerClassic",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="4" height="4" x="4.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 26
          moveTo(x = 4.0f, y = 26.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="4" x="14.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 26
          moveTo(x = 14.0f, y = 26.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="4" x="24.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 26
          moveTo(x = 24.0f, y = 26.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M25 16 h-8 v-4 h-2 v4 H7 a2 2 0 0 0 -2 2 v6 h2 v-6 h8 v6 h2 v-6 h8 v6 h2 v-6 a2 2 0 0 0 -2 -2 m-5 -6 V2 h-8 v8Z m-6 -2 V4 h4 v4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 16
          moveTo(x = 25.0f, y = 16.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // m -5 -6
          moveToRelative(dx = -5.0f, dy = -6.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 8z
          verticalLineToRelative(dy = 8.0f)
          close()
          // m -6 -2
          moveToRelative(dx = -6.0f, dy = -2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
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
      .also { _loadBalancerClassic = it }
  }

@Suppress("ObjectPropertyName")
private var _loadBalancerClassic: ImageVector? = null
