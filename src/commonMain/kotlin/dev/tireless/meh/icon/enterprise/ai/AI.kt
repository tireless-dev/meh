// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AI: ImageVector
  get() {
    val current = _aI
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AI",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="17.0 11.0 20.0 11.0 20.0 21.0 17.0 21.0 17.0 23.0 25.0 23.0 25.0 21.0 22.0 21.0 22.0 11.0 25.0 11.0 25.0 9.0 17.0 9.0 17.0 11.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 17 11
          moveTo(x = 17.0f, y = 11.0f)
          // L 20 11
          lineTo(x = 20.0f, y = 11.0f)
          // L 20 21
          lineTo(x = 20.0f, y = 21.0f)
          // L 17 21
          lineTo(x = 17.0f, y = 21.0f)
          // L 17 23
          lineTo(x = 17.0f, y = 23.0f)
          // L 25 23
          lineTo(x = 25.0f, y = 23.0f)
          // L 25 21
          lineTo(x = 25.0f, y = 21.0f)
          // L 22 21
          lineTo(x = 22.0f, y = 21.0f)
          // L 22 11
          lineTo(x = 22.0f, y = 11.0f)
          // L 25 11
          lineTo(x = 25.0f, y = 11.0f)
          // L 25 9
          lineTo(x = 25.0f, y = 9.0f)
          // L 17 9
          lineTo(x = 17.0f, y = 9.0f)
          // L 17 11z
          lineTo(x = 17.0f, y = 11.0f)
          close()
        }
        // M13 9 H9 a2 2 0 0 0 -2 2 v12 h2 v-5 h4 v5 h2 V11 a2 2 0 0 0 -2 -2 m-4 7 v-5 h4 v5z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 9
          moveTo(x = 13.0f, y = 9.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 11
          verticalLineTo(y = 11.0f)
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
          // m -4 7
          moveToRelative(dx = -4.0f, dy = 7.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 5z
          verticalLineToRelative(dy = 5.0f)
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
      .also { _aI = it }
  }

@Suppress("ObjectPropertyName")
private var _aI: ImageVector? = null
