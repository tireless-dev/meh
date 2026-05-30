// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Review: ImageVector
  get() {
    val current = _review
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Review",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.0 8.0 17.912 11.703 22.0 12.297 19.0 15.0 20.0 19.0 16.0 16.75 12.0 19.0 13.0 15.0 10.0 12.297 14.2 11.703 16.0 8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 8
          moveTo(x = 16.0f, y = 8.0f)
          // L 17.912 11.703
          lineTo(x = 17.912f, y = 11.703f)
          // L 22 12.297
          lineTo(x = 22.0f, y = 12.297f)
          // L 19 15
          lineTo(x = 19.0f, y = 15.0f)
          // L 20 19
          lineTo(x = 20.0f, y = 19.0f)
          // L 16 16.75
          lineTo(x = 16.0f, y = 16.75f)
          // L 12 19
          lineTo(x = 12.0f, y = 19.0f)
          // L 13 15
          lineTo(x = 13.0f, y = 15.0f)
          // L 10 12.297
          lineTo(x = 10.0f, y = 12.297f)
          // L 14.2 11.703
          lineTo(x = 14.2f, y = 11.703f)
          // L 16 8z
          lineTo(x = 16.0f, y = 8.0f)
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
      .also { _review = it }
  }

@Suppress("ObjectPropertyName")
private var _review: ImageVector? = null
