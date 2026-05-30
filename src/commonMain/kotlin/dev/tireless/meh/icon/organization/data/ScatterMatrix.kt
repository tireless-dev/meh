// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScatterMatrix: ImageVector
  get() {
    val current = _scatterMatrix
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ScatterMatrix",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="9.5" cy="9.5" radius="2.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9.5 9.5
          moveTo(x = 9.5f, y = 9.5f)
          // m -2.5 0
          moveToRelative(dx = -2.5f, dy = 0.0f)
          // a 2.5 2.5 0 1 1 5 0
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 0.0f,
          )
          // a 2.5 2.5 0 1 1 -5 0z
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="9.5" cy="22.5" radius="2.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9.5 22.5
          moveTo(x = 9.5f, y = 22.5f)
          // m -2.5 0
          moveToRelative(dx = -2.5f, dy = 0.0f)
          // a 2.5 2.5 0 1 1 5 0
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 0.0f,
          )
          // a 2.5 2.5 0 1 1 -5 0z
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="22.5" cy="22.5" radius="2.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.5 22.5
          moveTo(x = 22.5f, y = 22.5f)
          // m -2.5 0
          moveToRelative(dx = -2.5f, dy = 0.0f)
          // a 2.5 2.5 0 1 1 5 0
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 0.0f,
          )
          // a 2.5 2.5 0 1 1 -5 0z
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 13 H17 V4 h11Z M15 4 v11 H4 V4Z M4 17 h11 v11 H4Z m13 11 V17 h11 v11Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // m 0 13
          moveToRelative(dx = 0.0f, dy = 13.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 11z
          horizontalLineToRelative(dx = 11.0f)
          close()
          // M 15 4
          moveTo(x = 15.0f, y = 4.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // M 4 17
          moveTo(x = 4.0f, y = 17.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // m 13 11
          moveToRelative(dx = 13.0f, dy = 11.0f)
          // V 17
          verticalLineTo(y = 17.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v 11z
          verticalLineToRelative(dy = 11.0f)
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
      .also { _scatterMatrix = it }
  }

@Suppress("ObjectPropertyName")
private var _scatterMatrix: ImageVector? = null
