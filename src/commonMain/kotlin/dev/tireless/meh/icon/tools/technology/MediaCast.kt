// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MediaCast: ImageVector
  get() {
    val current = _mediaCast
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MediaCast",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M2 26 h3 a3 3 0 0 0 -3 -3Z m7 0 H7 a5 5 0 0 0 -5 -5 v-2 a7 7 0 0 1 7 7
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 26
          moveTo(x = 2.0f, y = 26.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 3 3 0 0 0 -3 -3z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          close()
          // m 7 0
          moveToRelative(dx = 7.0f, dy = 0.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 7 7 0 0 1 7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
        }
        // M13 26 h-2 a9 9 0 0 0 -9 -9 v-2 a11 11 0 0 1 11 11
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 26
          moveTo(x = 13.0f, y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 9 9 0 0 0 -9 -9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -9.0f,
            dy1 = -9.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 11 11 0 0 1 11 11
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 11.0f,
            dy1 = 11.0f,
          )
        }
        // M28 26 H15 v-2 h13 V8 H4 v5 H2 V8 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v16 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 26
          moveTo(x = 28.0f, y = 26.0f)
          // H 15
          horizontalLineTo(x = 15.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 13
          horizontalLineToRelative(dx = 13.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
      .also { _mediaCast = it }
  }

@Suppress("ObjectPropertyName")
private var _mediaCast: ImageVector? = null
