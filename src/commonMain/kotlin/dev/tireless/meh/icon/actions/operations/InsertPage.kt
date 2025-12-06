// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InsertPage: ImageVector
  get() {
    val current = _insertPage
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.InsertPage",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 30 h-2 V20 H12 v10 h-2 V20 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 30
          moveTo(x = 26.0f, y = 30.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 20
          verticalLineTo(y = 20.0f)
          // H 12
          horizontalLineTo(x = 12.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 20
          verticalLineTo(y = 20.0f)
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
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // a 2 2 0 0 1 2 2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          close()
        }
        // <polygon points="5.17 16.0 2.0 19.17 3.411 20.589 8.0 16.0 3.42 11.42 2.0 12.83 5.17 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5.17 16
          moveTo(x = 5.17f, y = 16.0f)
          // L 2 19.17
          lineTo(x = 2.0f, y = 19.17f)
          // L 3.411 20.589
          lineTo(x = 3.411f, y = 20.589f)
          // L 8 16
          lineTo(x = 8.0f, y = 16.0f)
          // L 3.42 11.42
          lineTo(x = 3.42f, y = 11.42f)
          // L 2 12.83
          lineTo(x = 2.0f, y = 12.83f)
          // L 5.17 16z
          lineTo(x = 5.17f, y = 16.0f)
          close()
        }
        // M24 14 H12 a2 2 0 0 1 -2 -2 V2 h2 v10 h12 V2 h2 v10 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 14
          moveTo(x = 24.0f, y = 14.0f)
          // H 12
          horizontalLineTo(x = 12.0f)
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
          // V 2
          verticalLineTo(y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
      .also { _insertPage = it }
  }

@Suppress("ObjectPropertyName")
private var _insertPage: ImageVector? = null
