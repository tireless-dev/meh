// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LoadBalancerVpc: ImageVector
  get() {
    val current = _loadBalancerVpc
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LoadBalancerVpc",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8 30 H2 v-6 h6Z m-4 -2 h2 v-2 H4Z m15 2 h-6 v-6 h6Z m-4 -2 h2 v-2 h-2Z m15 2 h-6 v-6 h6Z m-4 -2 h2 v-2 h-2Z M16 10 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2 m10 12 h-5 a4 4 0 0 1 -4 -4 h-2 a4 4 0 0 1 -4 4 H6 a2 2 0 0 0 -2 2 v4 h2 v-4 h5 a6 6 0 0 0 4 -1.54 V22 h2 v-5.54 A6 6 0 0 0 21 18 h5 v4 h2 v-4 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 30
          moveTo(x = 8.0f, y = 30.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m -4 -2
          moveToRelative(dx = -4.0f, dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // m 15 2
          moveToRelative(dx = 15.0f, dy = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m -4 -2
          moveToRelative(dx = -4.0f, dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m 15 2
          moveToRelative(dx = 15.0f, dy = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // m -4 -2
          moveToRelative(dx = -4.0f, dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // M 16 10
          moveTo(x = 16.0f, y = 10.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
          // m 10 12
          moveToRelative(dx = 10.0f, dy = 12.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 6 6 0 0 0 4 -1.54
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -1.54f,
          )
          // V 22
          verticalLineTo(y = 22.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5.54
          verticalLineToRelative(dy = -5.54f)
          // A 6 6 0 0 0 21 18
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 18.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
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
      .also { _loadBalancerVpc = it }
  }

@Suppress("ObjectPropertyName")
private var _loadBalancerVpc: ImageVector? = null
