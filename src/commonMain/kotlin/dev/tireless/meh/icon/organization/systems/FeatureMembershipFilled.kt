// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FeatureMembershipFilled: ImageVector
  get() {
    val current = _featureMembershipFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FeatureMembershipFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14 28 v-9 l8 -8 -9 -9 -9 9 8 8 v9 a2 2 0 0 0 2 2 h14 v-2z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 28
          moveTo(x = 14.0f, y = 28.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // l 8 -8
          lineToRelative(dx = 8.0f, dy = -8.0f)
          // l -9 -9
          lineToRelative(dx = -9.0f, dy = -9.0f)
          // l -9 9
          lineToRelative(dx = -9.0f, dy = 9.0f)
          // l 8 8
          lineToRelative(dx = 8.0f, dy = 8.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
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
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
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
      .also { _featureMembershipFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _featureMembershipFilled: ImageVector? = null
