// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InterfaceUsage: ImageVector
  get() {
    val current = _interfaceUsage
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.InterfaceUsage",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18.32 11.73 v1.3 H17 v1.73 h1.32 V22 h2.2 v-7.24 h1.85 v-1.74 h-1.84 v-2 h1.84 V9.28 H20.8 c-1.62 0 -2.48 .88 -2.48 2.46
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.32 11.73
          moveTo(x = 18.32f, y = 11.73f)
          // v 1.3
          verticalLineToRelative(dy = 1.3f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v 1.73
          verticalLineToRelative(dy = 1.73f)
          // h 1.32
          horizontalLineToRelative(dx = 1.32f)
          // V 22
          verticalLineTo(y = 22.0f)
          // h 2.2
          horizontalLineToRelative(dx = 2.2f)
          // v -7.24
          verticalLineToRelative(dy = -7.24f)
          // h 1.85
          horizontalLineToRelative(dx = 1.85f)
          // v -1.74
          verticalLineToRelative(dy = -1.74f)
          // h -1.84
          horizontalLineToRelative(dx = -1.84f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 1.84
          horizontalLineToRelative(dx = 1.84f)
          // V 9.28
          verticalLineTo(y = 9.28f)
          // H 20.8
          horizontalLineTo(x = 20.8f)
          // c -1.62 0 -2.48 0.88 -2.48 2.46
          curveToRelative(
            dx1 = -1.62f,
            dy1 = 0.0f,
            dx2 = -2.48f,
            dy2 = 0.88f,
            dx3 = -2.48f,
            dy3 = 2.46f,
          )
        }
        // <polygon points="10.0 11.8193 11.582 11.8193 11.582 20.1772 10.0 20.1772 10.0 22.0 15.4516 22.0 15.4516 20.1772 13.8525 20.1772 13.8525 11.8193 15.4516 11.8193 15.4516 9.9966 10.0 9.9966 10.0 11.8193" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 10 11.8193
          moveTo(x = 10.0f, y = 11.8193f)
          // L 11.582 11.8193
          lineTo(x = 11.582f, y = 11.8193f)
          // L 11.582 20.1772
          lineTo(x = 11.582f, y = 20.1772f)
          // L 10 20.1772
          lineTo(x = 10.0f, y = 20.1772f)
          // L 10 22
          lineTo(x = 10.0f, y = 22.0f)
          // L 15.4516 22
          lineTo(x = 15.4516f, y = 22.0f)
          // L 15.4516 20.1772
          lineTo(x = 15.4516f, y = 20.1772f)
          // L 13.8525 20.1772
          lineTo(x = 13.8525f, y = 20.1772f)
          // L 13.8525 11.8193
          lineTo(x = 13.8525f, y = 11.8193f)
          // L 15.4516 11.8193
          lineTo(x = 15.4516f, y = 11.8193f)
          // L 15.4516 9.9966
          lineTo(x = 15.4516f, y = 9.9966f)
          // L 10 9.9966
          lineTo(x = 10.0f, y = 9.9966f)
          // L 10 11.8193z
          lineTo(x = 10.0f, y = 11.8193f)
          close()
        }
        // M21 30 H11 c-4.96 0 -9 -4.04 -9 -9 V11 c0 -4.96 4.04 -9 9 -9 h10 c4.96 0 9 4.04 9 9 v10 c0 4.96 -4.04 9 -9 9 M11 4 a7 7 0 0 0 -7 7 v10 a7 7 0 0 0 7 7 h10 a7 7 0 0 0 7 -7 V11 a7 7 0 0 0 -7 -7z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 30
          moveTo(x = 21.0f, y = 30.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -4.96 0 -9 -4.04 -9 -9
          curveToRelative(
            dx1 = -4.96f,
            dy1 = 0.0f,
            dx2 = -9.0f,
            dy2 = -4.04f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // c 0 -4.96 4.04 -9 9 -9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.96f,
            dx2 = 4.04f,
            dy2 = -9.0f,
            dx3 = 9.0f,
            dy3 = -9.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 4.96 0 9 4.04 9 9
          curveToRelative(
            dx1 = 4.96f,
            dy1 = 0.0f,
            dx2 = 9.0f,
            dy2 = 4.04f,
            dx3 = 9.0f,
            dy3 = 9.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // c 0 4.96 -4.04 9 -9 9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 4.96f,
            dx2 = -4.04f,
            dy2 = 9.0f,
            dx3 = -9.0f,
            dy3 = 9.0f,
          )
          // M 11 4
          moveTo(x = 11.0f, y = 4.0f)
          // a 7 7 0 0 0 -7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 7 7 0 0 0 7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 7 7 0 0 0 7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = -7.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // a 7 7 0 0 0 -7 -7z
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
        strokeLineWidth = 0.0f,
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
      .also { _interfaceUsage = it }
  }

@Suppress("ObjectPropertyName")
private var _interfaceUsage: ImageVector? = null
