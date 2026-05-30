// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChatOperational: ImageVector
  get() {
    val current = _chatOperational
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChatOperational",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="15.586 10.414 19.166 14.0 19.166 14.0 15.584 17.587 17.0 19.0 22.0 14.0 17.0 9.0 15.586 10.414" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15.586 10.414
          moveTo(x = 15.586f, y = 10.414f)
          // L 19.166 14
          lineTo(x = 19.166f, y = 14.0f)
          // L 19.166 14
          lineTo(x = 19.166f, y = 14.0f)
          // L 15.584 17.587
          lineTo(x = 15.584f, y = 17.587f)
          // L 17 19
          lineTo(x = 17.0f, y = 19.0f)
          // L 22 14
          lineTo(x = 22.0f, y = 14.0f)
          // L 17 9
          lineTo(x = 17.0f, y = 9.0f)
          // L 15.586 10.414z
          lineTo(x = 15.586f, y = 10.414f)
          close()
        }
        // <polygon points="20.586 10.414 24.166 14.0 24.166 14.0 20.584 17.587 22.0 19.0 27.0 14.0 22.0 9.0 20.586 10.414" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.586 10.414
          moveTo(x = 20.586f, y = 10.414f)
          // L 24.166 14
          lineTo(x = 24.166f, y = 14.0f)
          // L 24.166 14
          lineTo(x = 24.166f, y = 14.0f)
          // L 20.584 17.587
          lineTo(x = 20.584f, y = 17.587f)
          // L 22 19
          lineTo(x = 22.0f, y = 19.0f)
          // L 27 14
          lineTo(x = 27.0f, y = 14.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 20.586 10.414z
          lineTo(x = 20.586f, y = 10.414f)
          close()
        }
        // <polygon points="10.0 9.0 11.593 12.0 15.0 12.414 12.5 14.667 13.0 18.0 10.0 16.125 7.0 18.0 7.5 14.667 5.0 12.414 8.5 12.0 10.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 9
          moveTo(x = 10.0f, y = 9.0f)
          // L 11.593 12
          lineTo(x = 11.593f, y = 12.0f)
          // L 15 12.414
          lineTo(x = 15.0f, y = 12.414f)
          // L 12.5 14.667
          lineTo(x = 12.5f, y = 14.667f)
          // L 13 18
          lineTo(x = 13.0f, y = 18.0f)
          // L 10 16.125
          lineTo(x = 10.0f, y = 16.125f)
          // L 7 18
          lineTo(x = 7.0f, y = 18.0f)
          // L 7.5 14.667
          lineTo(x = 7.5f, y = 14.667f)
          // L 5 12.414
          lineTo(x = 5.0f, y = 12.414f)
          // L 8.5 12
          lineTo(x = 8.5f, y = 12.0f)
          // L 10 9z
          lineTo(x = 10.0f, y = 9.0f)
          close()
        }
        // M17.74 30 16 29 l4 -7 h6 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h9 v2 H6 a4 4 0 0 1 -4 -4 V8 a4 4 0 0 1 4 -4 h20 a4 4 0 0 1 4 4 v12 a4 4 0 0 1 -4 4 h-4.84Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.74 30
          moveTo(x = 17.74f, y = 30.0f)
          // L 16 29
          lineTo(x = 16.0f, y = 29.0f)
          // l 4 -7
          lineToRelative(dx = 4.0f, dy = -7.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
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
          // V 8
          verticalLineTo(y = 8.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // a 4 4 0 0 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // h -4.84z
          horizontalLineToRelative(dx = -4.84f)
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
      .also { _chatOperational = it }
  }

@Suppress("ObjectPropertyName")
private var _chatOperational: ImageVector? = null
