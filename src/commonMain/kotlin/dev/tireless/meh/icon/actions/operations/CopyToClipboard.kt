// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CopyToClipboard: ImageVector
  get() {
    val current = _copyToClipboard
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CopyToClipboard",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M7 7 h3 v3 h12 V7 h3 v11 h2 V7 a2 2 0 0 0 -2 -2 h-3 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 H7 a2 2 0 0 0 -2 2 v21 a2 2 0 0 0 2 2 h9 v-2 H7z m5 -3 h8 v4 h-8z m18 20 h-8.17 l2.58 -2.59 L23 20 l-5 5 5 5 1.41 -1.41 L21.83 26 H30z M12 13 h-2 v2 h2z m10 0 h-8 v2 h8z m-10 5 h-2 v2 h2z m-2 7 h2 v-2 h-2z m4 -5 h4 v-2 h-4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 7
          moveTo(x = 7.0f, y = 7.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 7
          verticalLineTo(y = 7.0f)
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
          // h -3
          horizontalLineToRelative(dx = -3.0f)
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
          // h -8
          horizontalLineToRelative(dx = -8.0f)
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
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // v 21
          verticalLineToRelative(dy = 21.0f)
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
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7z
          horizontalLineTo(x = 7.0f)
          close()
          // m 5 -3
          moveToRelative(dx = 5.0f, dy = -3.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
          // m 18 20
          moveToRelative(dx = 18.0f, dy = 20.0f)
          // h -8.17
          horizontalLineToRelative(dx = -8.17f)
          // l 2.58 -2.59
          lineToRelative(dx = 2.58f, dy = -2.59f)
          // L 23 20
          lineTo(x = 23.0f, y = 20.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 21.83 26
          lineTo(x = 21.83f, y = 26.0f)
          // H 30z
          horizontalLineTo(x = 30.0f)
          close()
          // M 12 13
          moveTo(x = 12.0f, y = 13.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 10 0
          moveToRelative(dx = 10.0f, dy = 0.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m -10 5
          moveToRelative(dx = -10.0f, dy = 5.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m -2 7
          moveToRelative(dx = -2.0f, dy = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m 4 -5
          moveToRelative(dx = 4.0f, dy = -5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
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
      .also { _copyToClipboard = it }
  }

@Suppress("ObjectPropertyName")
private var _copyToClipboard: ImageVector? = null
