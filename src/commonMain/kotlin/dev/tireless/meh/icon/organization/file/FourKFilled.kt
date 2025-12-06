// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
@file:Suppress("ktlint:standard:filename")

package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FourKFilled: ImageVector
  get() {
    val current = _4KFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.4KFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 6 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 M14 21 h-2 v-4 H8 v-6 h2 v4 h2 v-4 h2Z m10.19 0 H22 l-2.09 -4.06 L19 18.27 V21 h-2 V11 h2 v4.39 L22 11 h2.19 l-3 4.38Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // M 14 21
          moveTo(x = 14.0f, y = 21.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 10.19 0
          moveToRelative(dx = 10.19f, dy = 0.0f)
          // H 22
          horizontalLineTo(x = 22.0f)
          // l -2.09 -4.06
          lineToRelative(dx = -2.09f, dy = -4.06f)
          // L 19 18.27
          lineTo(x = 19.0f, y = 18.27f)
          // V 21
          verticalLineTo(y = 21.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4.39
          verticalLineToRelative(dy = 4.39f)
          // L 22 11
          lineTo(x = 22.0f, y = 11.0f)
          // h 2.19
          horizontalLineToRelative(dx = 2.19f)
          // l -3 4.38z
          lineToRelative(dx = -3.0f, dy = 4.38f)
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
      .also { _4KFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _4KFilled: ImageVector? = null
