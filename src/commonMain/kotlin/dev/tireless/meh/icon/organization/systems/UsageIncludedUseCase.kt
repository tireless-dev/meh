// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UsageIncludedUseCase: ImageVector
  get() {
    val current = _usageIncludedUseCase
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UsageIncludedUseCase",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M13 28 V5.83 l7.59 7.58 L22 12 12 2 2 12 l1.41 1.41 L11 5.83 V28 a2 2 0 0 0 2 2 h15 v-2z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 28
          moveTo(x = 13.0f, y = 28.0f)
          // V 5.83
          verticalLineTo(y = 5.83f)
          // l 7.59 7.58
          lineToRelative(dx = 7.59f, dy = 7.58f)
          // L 22 12
          lineTo(x = 22.0f, y = 12.0f)
          // L 12 2
          lineTo(x = 12.0f, y = 2.0f)
          // L 2 12
          lineTo(x = 2.0f, y = 12.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 11 5.83
          lineTo(x = 11.0f, y = 5.83f)
          // V 28
          verticalLineTo(y = 28.0f)
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
          // h 15
          horizontalLineToRelative(dx = 15.0f)
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
      .also { _usageIncludedUseCase = it }
  }

@Suppress("ObjectPropertyName")
private var _usageIncludedUseCase: ImageVector? = null
