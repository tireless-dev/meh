// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TopPrograms: ImageVector
  get() {
    val current = _topPrograms
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TopPrograms",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m30 28.59 -2.83 -2.84 a5 5 0 1 0 -1.41 1.41 L28.57 30z M23 26 a3 3 0 1 1 0 -6 3 3 0 0 1 0 6 m5 -24 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h10 v-2 H4 V10 h24 v4 h2 V4 a2 2 0 0 0 -2 -2 M4 8 V4 h24 v4z m3 -2 a1 1 0 1 1 -2 0 1 1 0 0 1 2 0 m3 0 a1 1 0 1 1 -2 0 1 1 0 0 1 2 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 28.59
          moveTo(x = 30.0f, y = 28.59f)
          // l -2.83 -2.84
          lineToRelative(dx = -2.83f, dy = -2.84f)
          // a 5 5 0 1 0 -1.41 1.41
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.41f,
            dy1 = 1.41f,
          )
          // L 28.57 30z
          lineTo(x = 28.57f, y = 30.0f)
          close()
          // M 23 26
          moveTo(x = 23.0f, y = 26.0f)
          // a 3 3 0 1 1 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // a 3 3 0 0 1 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 6.0f,
          )
          // m 5 -24
          moveToRelative(dx = 5.0f, dy = -24.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // M 4 8
          moveTo(x = 4.0f, y = 8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
          // m 3 -2
          moveToRelative(dx = 3.0f, dy = -2.0f)
          // a 1 1 0 1 1 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // m 3 0
          moveToRelative(dx = 3.0f, dy = 0.0f)
          // a 1 1 0 1 1 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
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
      .also { _topPrograms = it }
  }

@Suppress("ObjectPropertyName")
private var _topPrograms: ImageVector? = null
