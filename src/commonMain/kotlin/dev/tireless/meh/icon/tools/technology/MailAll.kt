// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MailAll: ImageVector
  get() {
    val current = _mailAll
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MailAll",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.59 20.41 20.17 24.0 20.17 24.0 16.58 27.59 18.0 29.0 23.0 24.0 18.0 19.0 16.59 20.41" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.59 20.41
          moveTo(x = 16.59f, y = 20.41f)
          // L 20.17 24
          lineTo(x = 20.17f, y = 24.0f)
          // L 20.17 24
          lineTo(x = 20.17f, y = 24.0f)
          // L 16.58 27.59
          lineTo(x = 16.58f, y = 27.59f)
          // L 18 29
          lineTo(x = 18.0f, y = 29.0f)
          // L 23 24
          lineTo(x = 23.0f, y = 24.0f)
          // L 18 19
          lineTo(x = 18.0f, y = 19.0f)
          // L 16.59 20.41z
          lineTo(x = 16.59f, y = 20.41f)
          close()
        }
        // <polygon points="23.59 20.41 27.17 24.0 27.17 24.0 23.58 27.59 25.0 29.0 30.0 24.0 25.0 19.0 23.59 20.41" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.59 20.41
          moveTo(x = 23.59f, y = 20.41f)
          // L 27.17 24
          lineTo(x = 27.17f, y = 24.0f)
          // L 27.17 24
          lineTo(x = 27.17f, y = 24.0f)
          // L 23.58 27.59
          lineTo(x = 23.58f, y = 27.59f)
          // L 25 29
          lineTo(x = 25.0f, y = 29.0f)
          // L 30 24
          lineTo(x = 30.0f, y = 24.0f)
          // L 25 19
          lineTo(x = 25.0f, y = 19.0f)
          // L 23.59 20.41z
          lineTo(x = 23.59f, y = 20.41f)
          close()
        }
        // M14 23 H4 V7.91 l11.43 7.91 a1 1 0 0 0 1.14 0 L28 7.91 V17 h2 V7 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h10Z M25.8 7 16 13.78 6.2 7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 23
          moveTo(x = 14.0f, y = 23.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 7.91
          verticalLineTo(y = 7.91f)
          // l 11.43 7.91
          lineToRelative(dx = 11.43f, dy = 7.91f)
          // a 1 1 0 0 0 1.14 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.14f,
            dy1 = 0.0f,
          )
          // L 28 7.91
          lineTo(x = 28.0f, y = 7.91f)
          // V 17
          verticalLineTo(y = 17.0f)
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
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
          // M 25.8 7
          moveTo(x = 25.8f, y = 7.0f)
          // L 16 13.78
          lineTo(x = 16.0f, y = 13.78f)
          // L 6.2 7z
          lineTo(x = 6.2f, y = 7.0f)
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
      .also { _mailAll = it }
  }

@Suppress("ObjectPropertyName")
private var _mailAll: ImageVector? = null
