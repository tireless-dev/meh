// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoSlack: ImageVector
  get() {
    val current = _logoSlack
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoSlack",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M9.04 19.17 a2.52 2.52 0 1 1 -2.52 -2.53 h2.52Z m1.27 0 a2.52 2.52 0 0 1 5.04 0 v6.3 a2.52 2.52 0 1 1 -5.04 0Z m2.52 -10.13 a2.52 2.52 0 1 1 2.53 -2.52 v2.52Z m0 1.27 a2.52 2.52 0 0 1 0 5.04 h-6.3 a2.52 2.52 0 1 1 0 -5.04Z m10.13 2.52 a2.52 2.52 0 1 1 2.52 2.53 h-2.52Z m-1.27 0 a2.52 2.52 0 0 1 -5.05 0 v-6.3 a2.52 2.52 0 1 1 5.05 0Z m-2.52 10.13 a2.52 2.52 0 1 1 -2.53 2.52 v-2.52Z m0 -1.27 a2.52 2.52 0 0 1 0 -5.05 h6.3 a2.52 2.52 0 1 1 0 5.05Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9.04 19.17
          moveTo(x = 9.04f, y = 19.17f)
          // a 2.52 2.52 0 1 1 -2.52 -2.53
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.52f,
            dy1 = -2.53f,
          )
          // h 2.52z
          horizontalLineToRelative(dx = 2.52f)
          close()
          // m 1.27 0
          moveToRelative(dx = 1.27f, dy = 0.0f)
          // a 2.52 2.52 0 0 1 5.04 0
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.04f,
            dy1 = 0.0f,
          )
          // v 6.3
          verticalLineToRelative(dy = 6.3f)
          // a 2.52 2.52 0 1 1 -5.04 0z
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.04f,
            dy1 = 0.0f,
          )
          close()
          // m 2.52 -10.13
          moveToRelative(dx = 2.52f, dy = -10.13f)
          // a 2.52 2.52 0 1 1 2.53 -2.52
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.53f,
            dy1 = -2.52f,
          )
          // v 2.52z
          verticalLineToRelative(dy = 2.52f)
          close()
          // m 0 1.27
          moveToRelative(dx = 0.0f, dy = 1.27f)
          // a 2.52 2.52 0 0 1 0 5.04
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 5.04f,
          )
          // h -6.3
          horizontalLineToRelative(dx = -6.3f)
          // a 2.52 2.52 0 1 1 0 -5.04z
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -5.04f,
          )
          close()
          // m 10.13 2.52
          moveToRelative(dx = 10.13f, dy = 2.52f)
          // a 2.52 2.52 0 1 1 2.52 2.53
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.52f,
            dy1 = 2.53f,
          )
          // h -2.52z
          horizontalLineToRelative(dx = -2.52f)
          close()
          // m -1.27 0
          moveToRelative(dx = -1.27f, dy = 0.0f)
          // a 2.52 2.52 0 0 1 -5.05 0
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.05f,
            dy1 = 0.0f,
          )
          // v -6.3
          verticalLineToRelative(dy = -6.3f)
          // a 2.52 2.52 0 1 1 5.05 0z
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.05f,
            dy1 = 0.0f,
          )
          close()
          // m -2.52 10.13
          moveToRelative(dx = -2.52f, dy = 10.13f)
          // a 2.52 2.52 0 1 1 -2.53 2.52
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.53f,
            dy1 = 2.52f,
          )
          // v -2.52z
          verticalLineToRelative(dy = -2.52f)
          close()
          // m 0 -1.27
          moveToRelative(dx = 0.0f, dy = -1.27f)
          // a 2.52 2.52 0 0 1 0 -5.05
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -5.05f,
          )
          // h 6.3
          horizontalLineToRelative(dx = 6.3f)
          // a 2.52 2.52 0 1 1 0 5.05z
          arcToRelative(
            a = 2.52f,
            b = 2.52f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 5.05f,
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
      .also { _logoSlack = it }
  }

@Suppress("ObjectPropertyName")
private var _logoSlack: ImageVector? = null
