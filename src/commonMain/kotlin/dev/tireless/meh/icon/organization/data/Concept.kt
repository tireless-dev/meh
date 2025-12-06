// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Concept: ImageVector
  get() {
    val current = _concept
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Concept",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20.89 19.47 a6 6 0 0 0 0 -6.94 L23 10.4 l1.3 1.3 a1 1 0 0 0 1.4 0 l4 -4 a1 1 0 0 0 0 -1.42 l-4 -4 a1 1 0 0 0 -1.4 0 l-4 4 a1 1 0 0 0 0 1.42 L21.58 9 l-2.12 2.11 a6 6 0 0 0 -6.94 0 L10 8.6 V2 H2 v8 h6.59 l2.52 2.53 a6 6 0 0 0 0 6.94 L9 21.6 l-1.3 -1.3 a1 1 0 0 0 -1.4 0 l-4 4 a1 1 0 0 0 0 1.42 l4 4 a1 1 0 0 0 1.4 0 l4 -4 a1 1 0 0 0 0 -1.42 L10.42 23 l2.12 -2.11 a6 6 0 0 0 6.94 0 L22 23.4 V30 h8 v-8 h-6.59Z M25 4.41 27.59 7 25 9.59 22.41 7Z M7 27.6 4.41 25 7 22.41 9.59 25Z M8 8 H4 V4 h4Z m4 8 a4 4 0 1 1 4 4 4 4 0 0 1 -4 -4 m12 8 h4 v4 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.89 19.47
          moveTo(x = 20.89f, y = 19.47f)
          // a 6 6 0 0 0 0 -6.94
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -6.94f,
          )
          // L 23 10.4
          lineTo(x = 23.0f, y = 10.4f)
          // l 1.3 1.3
          lineToRelative(dx = 1.3f, dy = 1.3f)
          // a 1 1 0 0 0 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // a 1 1 0 0 0 0 -1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.42f,
          )
          // l -4 -4
          lineToRelative(dx = -4.0f, dy = -4.0f)
          // a 1 1 0 0 0 -1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 0.0f,
          )
          // l -4 4
          lineToRelative(dx = -4.0f, dy = 4.0f)
          // a 1 1 0 0 0 0 1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.42f,
          )
          // L 21.58 9
          lineTo(x = 21.58f, y = 9.0f)
          // l -2.12 2.11
          lineToRelative(dx = -2.12f, dy = 2.11f)
          // a 6 6 0 0 0 -6.94 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.94f,
            dy1 = 0.0f,
          )
          // L 10 8.6
          lineTo(x = 10.0f, y = 8.6f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 6.59
          horizontalLineToRelative(dx = 6.59f)
          // l 2.52 2.53
          lineToRelative(dx = 2.52f, dy = 2.53f)
          // a 6 6 0 0 0 0 6.94
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.94f,
          )
          // L 9 21.6
          lineTo(x = 9.0f, y = 21.6f)
          // l -1.3 -1.3
          lineToRelative(dx = -1.3f, dy = -1.3f)
          // a 1 1 0 0 0 -1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 0.0f,
          )
          // l -4 4
          lineToRelative(dx = -4.0f, dy = 4.0f)
          // a 1 1 0 0 0 0 1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.42f,
          )
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // a 1 1 0 0 0 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // a 1 1 0 0 0 0 -1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.42f,
          )
          // L 10.42 23
          lineTo(x = 10.42f, y = 23.0f)
          // l 2.12 -2.11
          lineToRelative(dx = 2.12f, dy = -2.11f)
          // a 6 6 0 0 0 6.94 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.94f,
            dy1 = 0.0f,
          )
          // L 22 23.4
          lineTo(x = 22.0f, y = 23.4f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -6.59z
          horizontalLineToRelative(dx = -6.59f)
          close()
          // M 25 4.41
          moveTo(x = 25.0f, y = 4.41f)
          // L 27.59 7
          lineTo(x = 27.59f, y = 7.0f)
          // L 25 9.59
          lineTo(x = 25.0f, y = 9.59f)
          // L 22.41 7z
          lineTo(x = 22.41f, y = 7.0f)
          close()
          // M 7 27.6
          moveTo(x = 7.0f, y = 27.6f)
          // L 4.41 25
          lineTo(x = 4.41f, y = 25.0f)
          // L 7 22.41
          lineTo(x = 7.0f, y = 22.41f)
          // L 9.59 25z
          lineTo(x = 9.59f, y = 25.0f)
          close()
          // M 8 8
          moveTo(x = 8.0f, y = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 4 8
          moveToRelative(dx = 4.0f, dy = 8.0f)
          // a 4 4 0 1 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
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
          // m 12 8
          moveToRelative(dx = 12.0f, dy = 8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
      .also { _concept = it }
  }

@Suppress("ObjectPropertyName")
private var _concept: ImageVector? = null
