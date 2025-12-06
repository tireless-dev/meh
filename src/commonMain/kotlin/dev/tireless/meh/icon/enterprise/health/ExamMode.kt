// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ExamMode: ImageVector
  get() {
    val current = _examMode
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ExamMode",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25 23 v3 H7 v-9.17 l3.59 3.58 L12 19 l-6 -6 -6 6 1.41 1.41 L5 16.83 V26 a2 2 0 0 0 2 2 h18 a2 2 0 0 0 2 -2 v-3Z m2 -16 v9.17 l3.59 -3.58 L32 14 l-6 6 -6 -6 1.41 -1.41 L25 16.17 V7 H13 V5 h12 a2 2 0 0 1 2 2 M8 10 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 M4 4 v4 h4 V4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 23
          moveTo(x = 25.0f, y = 23.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v -9.17
          verticalLineToRelative(dy = -9.17f)
          // l 3.59 3.58
          lineToRelative(dx = 3.59f, dy = 3.58f)
          // L 12 19
          lineTo(x = 12.0f, y = 19.0f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // l -6 6
          lineToRelative(dx = -6.0f, dy = 6.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 5 16.83
          lineTo(x = 5.0f, y = 16.83f)
          // V 26
          verticalLineTo(y = 26.0f)
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
          // h 18
          horizontalLineToRelative(dx = 18.0f)
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
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
          // m 2 -16
          moveToRelative(dx = 2.0f, dy = -16.0f)
          // v 9.17
          verticalLineToRelative(dy = 9.17f)
          // l 3.59 -3.58
          lineToRelative(dx = 3.59f, dy = -3.58f)
          // L 32 14
          lineTo(x = 32.0f, y = 14.0f)
          // l -6 6
          lineToRelative(dx = -6.0f, dy = 6.0f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 25 16.17
          lineTo(x = 25.0f, y = 16.17f)
          // V 7
          verticalLineTo(y = 7.0f)
          // H 13
          horizontalLineTo(x = 13.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
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
          // M 8 10
          moveTo(x = 8.0f, y = 10.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
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
      .also { _examMode = it }
  }

@Suppress("ObjectPropertyName")
private var _examMode: ImageVector? = null
