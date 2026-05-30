// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PerformAction: ImageVector
  get() {
    val current = _performAction
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PerformAction",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 2 H11 c-5 0 -9 4 -9 9 v10 c0 5 4 9 9 9 h10 c5 0 9 -4 9 -9 V11 c0 -5 -4 -9 -9 -9 m7 19 c0 3.9 -3.1 7 -7 7 H11 c-3.9 0 -7 -3.1 -7 -7 V11 c0 -3.9 3.1 -7 7 -7 h10 c3.9 0 7 3.1 7 7z m-4 -10 h-6 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-6 8 v-6 h6 v6z m-7 -8 5 5 -5 5 -1.5 -1.4 2.7 -2.6 H6 v-2 h6.2 l-2.7 -2.6z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 2
          moveTo(x = 21.0f, y = 2.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -5 0 -9 4 -9 9
          curveToRelative(
            dx1 = -5.0f,
            dy1 = 0.0f,
            dx2 = -9.0f,
            dy2 = 4.0f,
            dx3 = -9.0f,
            dy3 = 9.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // c 0 5 4 9 9 9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 5.0f,
            dx2 = 4.0f,
            dy2 = 9.0f,
            dx3 = 9.0f,
            dy3 = 9.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 5 0 9 -4 9 -9
          curveToRelative(
            dx1 = 5.0f,
            dy1 = 0.0f,
            dx2 = 9.0f,
            dy2 = -4.0f,
            dx3 = 9.0f,
            dy3 = -9.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // c 0 -5 -4 -9 -9 -9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -5.0f,
            dx2 = -4.0f,
            dy2 = -9.0f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
          // m 7 19
          moveToRelative(dx = 7.0f, dy = 19.0f)
          // c 0 3.9 -3.1 7 -7 7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 3.9f,
            dx2 = -3.1f,
            dy2 = 7.0f,
            dx3 = -7.0f,
            dy3 = 7.0f,
          )
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -3.9 0 -7 -3.1 -7 -7
          curveToRelative(
            dx1 = -3.9f,
            dy1 = 0.0f,
            dx2 = -7.0f,
            dy2 = -3.1f,
            dx3 = -7.0f,
            dy3 = -7.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // c 0 -3.9 3.1 -7 7 -7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.9f,
            dx2 = 3.1f,
            dy2 = -7.0f,
            dx3 = 7.0f,
            dy3 = -7.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 3.9 0 7 3.1 7 7z
          curveToRelative(
            dx1 = 3.9f,
            dy1 = 0.0f,
            dx2 = 7.0f,
            dy2 = 3.1f,
            dx3 = 7.0f,
            dy3 = 7.0f,
          )
          close()
          // m -4 -10
          moveToRelative(dx = -4.0f, dy = -10.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // m -6 8
          moveToRelative(dx = -6.0f, dy = 8.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 6z
          verticalLineToRelative(dy = 6.0f)
          close()
          // m -7 -8
          moveToRelative(dx = -7.0f, dy = -8.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l -1.5 -1.4
          lineToRelative(dx = -1.5f, dy = -1.4f)
          // l 2.7 -2.6
          lineToRelative(dx = 2.7f, dy = -2.6f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6.2
          horizontalLineToRelative(dx = 6.2f)
          // l -2.7 -2.6z
          lineToRelative(dx = -2.7f, dy = -2.6f)
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
      .also { _performAction = it }
  }

@Suppress("ObjectPropertyName")
private var _performAction: ImageVector? = null
