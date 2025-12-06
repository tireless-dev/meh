// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Deploy: ImageVector
  get() {
    val current = _deploy
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Deploy",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m23 2 -6 6 1.41 1.4 L22 5.82 V28 H6 V12 H4 v16 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 V5.82 l3.59 3.58 L29 8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 2
          moveTo(x = 23.0f, y = 2.0f)
          // l -6 6
          lineToRelative(dx = -6.0f, dy = 6.0f)
          // l 1.41 1.4
          lineToRelative(dx = 1.41f, dy = 1.4f)
          // L 22 5.82
          lineTo(x = 22.0f, y = 5.82f)
          // V 28
          verticalLineTo(y = 28.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 5.82
          verticalLineTo(y = 5.82f)
          // l 3.59 3.58
          lineToRelative(dx = 3.59f, dy = 3.58f)
          // L 29 8z
          lineTo(x = 29.0f, y = 8.0f)
          close()
        }
        // M16 24 h-4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 m-4 -6 v4 h4 v-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 24
          moveTo(x = 16.0f, y = 24.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // m -4 -6
          moveToRelative(dx = -4.0f, dy = -6.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
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
      .also { _deploy = it }
  }

@Suppress("ObjectPropertyName")
private var _deploy: ImageVector? = null
