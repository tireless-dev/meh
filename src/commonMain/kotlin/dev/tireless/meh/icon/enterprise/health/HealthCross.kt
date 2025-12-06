// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HealthCross: ImageVector
  get() {
    val current = _healthCross
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HealthCross",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 28 h-6 a2 2 0 0 1 -2 -2 v-5 H6 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h5 V6 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2 v5 h5 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 h-5 v5 a2 2 0 0 1 -2 2 M6 13 v6 h7 v7 h6 v-7 h7 v-6 h-7 V6 h-6 v7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 28
          moveTo(x = 19.0f, y = 28.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
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
          // M 6 13
          moveTo(x = 6.0f, y = 13.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 7z
          verticalLineToRelative(dy = 7.0f)
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
      .also { _healthCross = it }
  }

@Suppress("ObjectPropertyName")
private var _healthCross: ImageVector? = null
