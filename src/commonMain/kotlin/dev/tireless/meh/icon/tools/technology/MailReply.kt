// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MailReply: ImageVector
  get() {
    val current = _mailReply
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MailReply",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m25 18 -1.41 1.41 L26.17 22 H18 a4 4 0 0 0 0 8 h2 v-2 h-2 a2 2 0 0 1 0 -4 h8.17 l-2.59 2.59 L25 28 l5 -5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 18
          moveTo(x = 25.0f, y = 18.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 26.17 22
          lineTo(x = 26.17f, y = 22.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // a 4 4 0 0 0 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 8.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 2 2 0 0 1 0 -4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
          )
          // h 8.17
          horizontalLineToRelative(dx = 8.17f)
          // l -2.59 2.59
          lineToRelative(dx = -2.59f, dy = 2.59f)
          // L 25 28
          lineTo(x = 25.0f, y = 28.0f)
          // l 5 -5z
          lineToRelative(dx = 5.0f, dy = -5.0f)
          close()
        }
        // M10 22 H4 V6.9 l11.43 7.92 a1 1 0 0 0 1.14 0 L28 6.91 V16 h2 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h6Z M25.8 6 16 12.78 6.2 6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 22
          moveTo(x = 10.0f, y = 22.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6.9
          verticalLineTo(y = 6.9f)
          // l 11.43 7.92
          lineToRelative(dx = 11.43f, dy = 7.92f)
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
          // L 28 6.91
          lineTo(x = 28.0f, y = 6.91f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // M 25.8 6
          moveTo(x = 25.8f, y = 6.0f)
          // L 16 12.78
          lineTo(x = 16.0f, y = 12.78f)
          // L 6.2 6z
          lineTo(x = 6.2f, y = 6.0f)
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
      .also { _mailReply = it }
  }

@Suppress("ObjectPropertyName")
private var _mailReply: ImageVector? = null
