// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataBin: ImageVector
  get() {
    val current = _dataBin
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataBin",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 h-8 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 2 v7 h-8 V4Z m0 9 v6 h-8 v-6Z m-8 15 v-7 h8 v7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // m 0 2
          moveToRelative(dx = 0.0f, dy = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // m 0 9
          moveToRelative(dx = 0.0f, dy = 9.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
          // m -8 15
          moveToRelative(dx = -8.0f, dy = 15.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 7z
          verticalLineToRelative(dy = 7.0f)
          close()
        }
        // <polygon points="12.0 15.0 10.0 15.0 10.0 13.0 8.0 13.0 8.0 15.0 6.0 15.0 6.0 17.0 8.0 17.0 8.0 19.0 10.0 19.0 10.0 17.0 12.0 17.0 12.0 15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 15
          moveTo(x = 12.0f, y = 15.0f)
          // L 10 15
          lineTo(x = 10.0f, y = 15.0f)
          // L 10 13
          lineTo(x = 10.0f, y = 13.0f)
          // L 8 13
          lineTo(x = 8.0f, y = 13.0f)
          // L 8 15
          lineTo(x = 8.0f, y = 15.0f)
          // L 6 15
          lineTo(x = 6.0f, y = 15.0f)
          // L 6 17
          lineTo(x = 6.0f, y = 17.0f)
          // L 8 17
          lineTo(x = 8.0f, y = 17.0f)
          // L 8 19
          lineTo(x = 8.0f, y = 19.0f)
          // L 10 19
          lineTo(x = 10.0f, y = 19.0f)
          // L 10 17
          lineTo(x = 10.0f, y = 17.0f)
          // L 12 17
          lineTo(x = 12.0f, y = 17.0f)
          // L 12 15z
          lineTo(x = 12.0f, y = 15.0f)
          close()
        }
        // M16 6 V4 h-6 a2 2 0 0 0 -2 2 v3.08 a6.99 6.99 0 0 0 0 13.84 V26 a2 2 0 0 0 2 2 h6 v-2 h-6 v-3.08 a6.99 6.99 0 0 0 0 -13.84 V6Z m-2 10 a5 5 0 1 1 -5 -5 5 5 0 0 1 5 5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 6
          moveTo(x = 16.0f, y = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
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
          // v 3.08
          verticalLineToRelative(dy = 3.08f)
          // a 6.99 6.99 0 0 0 0 13.84
          arcToRelative(
            a = 6.99f,
            b = 6.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 13.84f,
          )
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -3.08
          verticalLineToRelative(dy = -3.08f)
          // a 6.99 6.99 0 0 0 0 -13.84
          arcToRelative(
            a = 6.99f,
            b = 6.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -13.84f,
          )
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m -2 10
          moveToRelative(dx = -2.0f, dy = 10.0f)
          // a 5 5 0 1 1 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // a 5 5 0 0 1 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
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
      .also { _dataBin = it }
  }

@Suppress("ObjectPropertyName")
private var _dataBin: ImageVector? = null
