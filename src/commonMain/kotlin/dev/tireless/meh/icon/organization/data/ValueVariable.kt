// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ValueVariable: ImageVector
  get() {
    val current = _valueVariable
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ValueVariable",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 28 h-4 v-2 h4 V6 h-4 V4 h4 a2 2 0 0 1 2 2 v20 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 28
          moveTo(x = 26.0f, y = 28.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
        }
        // <polygon points="20.0 11.0 18.0 11.0 16.0 14.897 14.0 11.0 12.0 11.0 14.905 16.0 12.0 21.0 14.0 21.0 16.0 17.201 18.0 21.0 20.0 21.0 17.098 16.0 20.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 11
          moveTo(x = 20.0f, y = 11.0f)
          // L 18 11
          lineTo(x = 18.0f, y = 11.0f)
          // L 16 14.897
          lineTo(x = 16.0f, y = 14.897f)
          // L 14 11
          lineTo(x = 14.0f, y = 11.0f)
          // L 12 11
          lineTo(x = 12.0f, y = 11.0f)
          // L 14.905 16
          lineTo(x = 14.905f, y = 16.0f)
          // L 12 21
          lineTo(x = 12.0f, y = 21.0f)
          // L 14 21
          lineTo(x = 14.0f, y = 21.0f)
          // L 16 17.201
          lineTo(x = 16.0f, y = 17.201f)
          // L 18 21
          lineTo(x = 18.0f, y = 21.0f)
          // L 20 21
          lineTo(x = 20.0f, y = 21.0f)
          // L 17.098 16
          lineTo(x = 17.098f, y = 16.0f)
          // L 20 11z
          lineTo(x = 20.0f, y = 11.0f)
          close()
        }
        // M10 28 H6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h4 v2 H6 v20 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 28
          moveTo(x = 10.0f, y = 28.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _valueVariable = it }
  }

@Suppress("ObjectPropertyName")
private var _valueVariable: ImageVector? = null
