// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Migrate: ImageVector
  get() {
    val current = _migrate
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Migrate",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 2 H6 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h9 v6.17 l-2.59 -2.58 L11 15 l5 5 5 -5 -1.41 -1.41 L17 16.17 V10 h9 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 M6 4 h4 v4 H6Z m20 4 H12 V4 h14Z m0 14 H6 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 0 -2 -2 M6 24 h14 v4 H6Z m20 4 h-4 v-4 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 2
          moveTo(x = 26.0f, y = 2.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // v 6.17
          verticalLineToRelative(dy = 6.17f)
          // l -2.59 -2.58
          lineToRelative(dx = -2.59f, dy = -2.58f)
          // L 11 15
          lineTo(x = 11.0f, y = 15.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 17 16.17
          lineTo(x = 17.0f, y = 16.17f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
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
          // M 6 4
          moveTo(x = 6.0f, y = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 20 4
          moveToRelative(dx = 20.0f, dy = 4.0f)
          // H 12
          horizontalLineTo(x = 12.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 14z
          horizontalLineToRelative(dx = 14.0f)
          close()
          // m 0 14
          moveToRelative(dx = 0.0f, dy = 14.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // M 6 24
          moveTo(x = 6.0f, y = 24.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 20 4
          moveToRelative(dx = 20.0f, dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _migrate = it }
  }

@Suppress("ObjectPropertyName")
private var _migrate: ImageVector? = null
