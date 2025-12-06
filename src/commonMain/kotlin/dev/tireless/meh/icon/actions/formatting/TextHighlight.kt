// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextHighlight: ImageVector
  get() {
    val current = _textHighlight
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextHighlight",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 15 H5 a3 3 0 0 1 -3 -3 v-2 a3 3 0 0 1 3 -3 h5 V5 a1 1 0 0 0 -1 -1 H3 V2 h6 a3 3 0 0 1 3 3Z M5 9 a1 1 0 0 0 -1 1 v2 a1 1 0 0 0 1 1 h5 V9Z m15 14 v2 a1 1 0 0 0 1 1 h5 v-4 h-5 a1 1 0 0 0 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 15
          moveTo(x = 12.0f, y = 15.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 3 3 0 0 1 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 3 3 0 0 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // H 3
          horizontalLineTo(x = 3.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 3 3 0 0 1 3 3z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          close()
          // M 5 9
          moveTo(x = 5.0f, y = 9.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // V 9z
          verticalLineTo(y = 9.0f)
          close()
          // m 15 14
          moveToRelative(dx = 15.0f, dy = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
        }
        // M2 30 h28 V2Z m26 -2 h-7 a3 3 0 0 1 -3 -3 v-2 a3 3 0 0 1 3 -3 h5 v-2 a1 1 0 0 0 -1 -1 h-6 v-2 h6 a3 3 0 0 1 3 3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 30
          moveTo(x = 2.0f, y = 30.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // V 2z
          verticalLineTo(y = 2.0f)
          close()
          // m 26 -2
          moveToRelative(dx = 26.0f, dy = -2.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // a 3 3 0 0 1 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 3 3 0 0 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 3 3 0 0 1 3 3z
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
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
      .also { _textHighlight = it }
  }

@Suppress("ObjectPropertyName")
private var _textHighlight: ImageVector? = null
