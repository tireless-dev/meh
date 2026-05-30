// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RequestQuote: ImageVector
  get() {
    val current = _requestQuote
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RequestQuote",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 22 v6 H6 V4 h10 V2 H6 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 22
          moveTo(x = 22.0f, y = 22.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
        }
        // m29.54 5.76 -3.3 -3.3 a1.6 1.6 0 0 0 -2.24 0 l-14 14 V22 h5.53 l14 -14 a1.6 1.6 0 0 0 0 -2.24Z M14.7 20 H12 v-2.7 l9.44 -9.45 2.71 2.71Z M25.56 9.15 l-2.71 -2.71 2.27 -2.27 2.71 2.71Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.54 5.76
          moveTo(x = 29.54f, y = 5.76f)
          // l -3.3 -3.3
          lineToRelative(dx = -3.3f, dy = -3.3f)
          // a 1.6 1.6 0 0 0 -2.24 0
          arcToRelative(
            a = 1.6f,
            b = 1.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.24f,
            dy1 = 0.0f,
          )
          // l -14 14
          lineToRelative(dx = -14.0f, dy = 14.0f)
          // V 22
          verticalLineTo(y = 22.0f)
          // h 5.53
          horizontalLineToRelative(dx = 5.53f)
          // l 14 -14
          lineToRelative(dx = 14.0f, dy = -14.0f)
          // a 1.6 1.6 0 0 0 0 -2.24z
          arcToRelative(
            a = 1.6f,
            b = 1.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.24f,
          )
          close()
          // M 14.7 20
          moveTo(x = 14.7f, y = 20.0f)
          // H 12
          horizontalLineTo(x = 12.0f)
          // v -2.7
          verticalLineToRelative(dy = -2.7f)
          // l 9.44 -9.45
          lineToRelative(dx = 9.44f, dy = -9.45f)
          // l 2.71 2.71z
          lineToRelative(dx = 2.71f, dy = 2.71f)
          close()
          // M 25.56 9.15
          moveTo(x = 25.56f, y = 9.15f)
          // l -2.71 -2.71
          lineToRelative(dx = -2.71f, dy = -2.71f)
          // l 2.27 -2.27
          lineToRelative(dx = 2.27f, dy = -2.27f)
          // l 2.71 2.71z
          lineToRelative(dx = 2.71f, dy = 2.71f)
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
      .also { _requestQuote = it }
  }

@Suppress("ObjectPropertyName")
private var _requestQuote: ImageVector? = null
